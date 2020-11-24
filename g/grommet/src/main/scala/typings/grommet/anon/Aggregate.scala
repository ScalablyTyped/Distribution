package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aggregate extends js.Object {
  
  var aggregate: js.UndefOr[Boolean] = js.native
}
object Aggregate {
  
  @scala.inline
  def apply(): Aggregate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aggregate]
  }
  
  @scala.inline
  implicit class AggregateOps[Self <: Aggregate] (val x: Self) extends AnyVal {
    
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
    def setAggregate(value: Boolean): Self = this.set("aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregate: Self = this.set("aggregate", js.undefined)
  }
}
