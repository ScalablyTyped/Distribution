package typings.jsreportPhantomPdf.mod

import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`dedicated-process`
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-server`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// const enum PhantomStrategy {
//   dedicatedProcess = 'dedicated-process',
//   phantomServer = 'phantom-server'
// }
@js.native
trait Options extends js.Object {
  
  var allowLocalFilesAccess: Boolean = js.native
  
  // appDirectory: string;
  var defaultPhantomjsVersion: String = js.native
  
  var strategy: `dedicated-process` | `phantom-server` = js.native
  
  var timeout: Double = js.native
}
object Options {
  
  @scala.inline
  def apply(
    allowLocalFilesAccess: Boolean,
    defaultPhantomjsVersion: String,
    strategy: `dedicated-process` | `phantom-server`,
    timeout: Double
  ): Options = {
    val __obj = js.Dynamic.literal(allowLocalFilesAccess = allowLocalFilesAccess.asInstanceOf[js.Any], defaultPhantomjsVersion = defaultPhantomjsVersion.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAllowLocalFilesAccess(value: Boolean): Self = this.set("allowLocalFilesAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPhantomjsVersion(value: String): Self = this.set("defaultPhantomjsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: `dedicated-process` | `phantom-server`): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
