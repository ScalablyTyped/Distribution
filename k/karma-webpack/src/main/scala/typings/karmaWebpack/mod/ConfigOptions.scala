package typings.karmaWebpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigOptions extends js.Object {
  
  var webpack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Configuration */ js.Any = js.native
  
  var webpackMiddleware: KarmaWebpackMiddlewareOptions = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(
    webpack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Configuration */ js.Any,
    webpackMiddleware: KarmaWebpackMiddlewareOptions
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal(webpack = webpack.asInstanceOf[js.Any], webpackMiddleware = webpackMiddleware.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setWebpack(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Webpack.Configuration */ js.Any
    ): Self = this.set("webpack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebpackMiddleware(value: KarmaWebpackMiddlewareOptions): Self = this.set("webpackMiddleware", value.asInstanceOf[js.Any])
  }
}
