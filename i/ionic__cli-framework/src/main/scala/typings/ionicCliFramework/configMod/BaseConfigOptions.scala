package typings.ionicCliFramework.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseConfigOptions extends js.Object {
  
  /**
    * If specified, the class will operate on a nested object within the config
    * file navigated to by this path prefix, an array of object path keys.
    *
    * For example, to operate on `c` object within `{ a: { b: { c: {} } } }`,
    * use `pathPrefix` of `['a', 'b', 'c']`.
    */
  var pathPrefix: js.UndefOr[js.Array[String]] = js.native
}
object BaseConfigOptions {
  
  @scala.inline
  def apply(): BaseConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseConfigOptions]
  }
  
  @scala.inline
  implicit class BaseConfigOptionsOps[Self <: BaseConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setPathPrefixVarargs(value: String*): Self = this.set("pathPrefix", js.Array(value :_*))
    
    @scala.inline
    def setPathPrefix(value: js.Array[String]): Self = this.set("pathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathPrefix: Self = this.set("pathPrefix", js.undefined)
  }
}
