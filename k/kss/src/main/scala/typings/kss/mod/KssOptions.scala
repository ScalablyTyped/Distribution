package typings.kss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KssOptions extends Options {
  
  var builder: js.UndefOr[js.Any] = js.native
  
  @JSName("clone")
  var clone_FKssOptions: js.UndefOr[Boolean] = js.native
  
  var custom: js.UndefOr[js.Any] = js.native
  
  var json: js.UndefOr[Boolean] = js.native
  
  var logErrorFunction: js.UndefOr[js.Function1[/* repeated */ String, Unit]] = js.native
  
  var source: js.Array[String] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object KssOptions {
  
  @scala.inline
  def apply(source: js.Array[String]): KssOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[KssOptions]
  }
  
  @scala.inline
  implicit class KssOptionsOps[Self <: KssOptions] (val x: Self) extends AnyVal {
    
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
    def setSourceVarargs(value: String*): Self = this.set("source", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: js.Array[String]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuilder(value: js.Any): Self = this.set("builder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuilder: Self = this.set("builder", js.undefined)
    
    @scala.inline
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    
    @scala.inline
    def setCustom(value: js.Any): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setLogErrorFunction(value: /* repeated */ String => Unit): Self = this.set("logErrorFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLogErrorFunction: Self = this.set("logErrorFunction", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
