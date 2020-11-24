package typings.koaRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouterOptions extends js.Object {
  
  /**
    * Methods which should be supported by the router.
    */
  var methods: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Prefix for all routes.
    */
  var prefix: js.UndefOr[String] = js.native
  
  var routerPath: js.UndefOr[String] = js.native
  
  /**
    * Whether or not routing should be case-sensitive.
    */
  var sensitive: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether or not routes should matched strictly.
    *
    * If strict matching is enabled, the trailing slash is taken into
    * account when matching routes.
    */
  var strict: js.UndefOr[Boolean] = js.native
}
object IRouterOptions {
  
  @scala.inline
  def apply(): IRouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRouterOptions]
  }
  
  @scala.inline
  implicit class IRouterOptionsOps[Self <: IRouterOptions] (val x: Self) extends AnyVal {
    
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
    def setMethodsVarargs(value: String*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[String]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRouterPath(value: String): Self = this.set("routerPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouterPath: Self = this.set("routerPath", js.undefined)
    
    @scala.inline
    def setSensitive(value: Boolean): Self = this.set("sensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitive: Self = this.set("sensitive", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
