package typings.lambdaLog.mod

import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaLogOptions extends js.Object {
  
  // Enable debugging mode (log.debug messages)
  var debug: js.UndefOr[Boolean] = js.native
  
  // Enable development mode which pretty-prints the log object to the console
  var dev: js.UndefOr[Boolean] = js.native
  
  // Optional function which will run for every log to inject dynamic metadata
  var dynamicMeta: js.UndefOr[js.Function1[/* message */ LogMessage, _]] = js.native
  
  var meta: js.UndefOr[js.Any] = js.native
  
  // Optional replacer function for `JSON.stringify`
  var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  
  // Disables logging to the console (used for testing)
  var silent: js.UndefOr[Boolean] = js.native
  
  // Optional stream to write stderr messages to
  var stderrStream: js.UndefOr[WriteStream] = js.native
  
  // Optional stream to write stdout messages to
  var stdoutStream: js.UndefOr[WriteStream] = js.native
  
  // Global tags array to include with every log
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object LambdaLogOptions {
  
  @scala.inline
  def apply(): LambdaLogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaLogOptions]
  }
  
  @scala.inline
  implicit class LambdaLogOptionsOps[Self <: LambdaLogOptions] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDev(value: Boolean): Self = this.set("dev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDev: Self = this.set("dev", js.undefined)
    
    @scala.inline
    def setDynamicMeta(value: /* message */ LogMessage => _): Self = this.set("dynamicMeta", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDynamicMeta: Self = this.set("dynamicMeta", js.undefined)
    
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = this.set("replacer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setStderrStream(value: WriteStream): Self = this.set("stderrStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStderrStream: Self = this.set("stderrStream", js.undefined)
    
    @scala.inline
    def setStdoutStream(value: WriteStream): Self = this.set("stdoutStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdoutStream: Self = this.set("stdoutStream", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
