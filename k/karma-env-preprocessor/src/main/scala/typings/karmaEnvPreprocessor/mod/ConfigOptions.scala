package typings.karmaEnvPreprocessor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigOptions extends js.Object {
  
  /**
    * environment variables available to your tests
    * {@link https://github.com/jsok/karma-env-preprocessor#configuration}
    */
  var envPreprocessor: js.UndefOr[js.Array[String]] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
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
    def setEnvPreprocessorVarargs(value: String*): Self = this.set("envPreprocessor", js.Array(value :_*))
    
    @scala.inline
    def setEnvPreprocessor(value: js.Array[String]): Self = this.set("envPreprocessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvPreprocessor: Self = this.set("envPreprocessor", js.undefined)
  }
}
