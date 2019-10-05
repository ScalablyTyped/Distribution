package typings.jqueryDotAjaxfile.Mocha

import typings.jqueryDotAjaxfile.Anon_Close
import typings.jqueryDotAjaxfile.Anon_Failures
import typings.jqueryDotAjaxfile.Mocha.reporters.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Mocha.reporters")
@js.native
object reporters extends js.Object {
  @js.native
  class Base protected () extends js.Object {
    def this(runner: IRunner) = this()
    var stats: Anon_Failures = js.native
  }
  
  @js.native
  class Doc () extends Base
  
  @js.native
  class Dot () extends Base
  
  @js.native
  class HTML () extends Base
  
  @js.native
  class HTMLCov () extends Base
  
  @js.native
  class JSON () extends Base
  
  @js.native
  class JSONCov () extends Base
  
  @js.native
  class JSONStream () extends Base
  
  @js.native
  class Landing () extends Base
  
  @js.native
  class List () extends Base
  
  @js.native
  class Markdown () extends Base
  
  @js.native
  class Min () extends Base
  
  @js.native
  class Nyan () extends Base
  
  @js.native
  class Progress protected () extends Base {
    /**
      * @param options.open String used to indicate the start of the progress bar.
      * @param options.complete String used to indicate a complete test on the progress bar.
      * @param options.incomplete String used to indicate an incomplete test on the progress bar.
      * @param options.close String used to indicate the end of the progress bar.
      */
    def this(runner: IRunner) = this()
    def this(runner: IRunner, options: Anon_Close) = this()
  }
  
  @js.native
  class Spec () extends Base
  
  @js.native
  class TAP () extends Base
  
  @js.native
  class XUnit protected () extends Base {
    def this(runner: IRunner) = this()
    def this(runner: IRunner, options: js.Any) = this()
  }
  
}

