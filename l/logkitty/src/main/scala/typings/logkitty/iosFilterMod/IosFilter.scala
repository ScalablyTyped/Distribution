package typings.logkitty.iosFilterMod

import typings.logkitty.typesMod.Entry
import typings.logkitty.typesMod.IFilter
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosFilter extends IFilter {
  
  var filter: js.Any = js.native
  
  val minPriority: js.Any = js.native
  
  def setFilterByMatch(regexes: js.Array[RegExp]): Unit = js.native
  
  def setFilterByTag(tags: js.Array[String]): Unit = js.native
}
object IosFilter {
  
  @scala.inline
  def apply(
    filter: js.Any,
    minPriority: js.Any,
    setFilterByMatch: js.Array[RegExp] => Unit,
    setFilterByTag: js.Array[String] => Unit,
    shouldInclude: Entry => Boolean
  ): IosFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], minPriority = minPriority.asInstanceOf[js.Any], setFilterByMatch = js.Any.fromFunction1(setFilterByMatch), setFilterByTag = js.Any.fromFunction1(setFilterByTag), shouldInclude = js.Any.fromFunction1(shouldInclude))
    __obj.asInstanceOf[IosFilter]
  }
  
  @scala.inline
  implicit class IosFilterOps[Self <: IosFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPriority(value: js.Any): Self = this.set("minPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFilterByMatch(value: js.Array[RegExp] => Unit): Self = this.set("setFilterByMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFilterByTag(value: js.Array[String] => Unit): Self = this.set("setFilterByTag", js.Any.fromFunction1(value))
  }
}
