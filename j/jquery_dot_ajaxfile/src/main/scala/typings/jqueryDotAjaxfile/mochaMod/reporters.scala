package typings.jqueryDotAjaxfile.mochaMod

import typings.jqueryDotAjaxfile.Anon_Close
import typings.jqueryDotAjaxfile.Mocha.IRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha", "reporters")
@js.native
object reporters extends js.Object {
  @js.native
  class Base protected ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base {
    def this(runner: IRunner) = this()
  }
  
  @js.native
  class Doc ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class Dot ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class HTML ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class HTMLCov ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class JSON ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class JSONCov ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class JSONStream ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class Landing ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class List ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class Markdown ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class Min ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class Nyan ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class Progress protected ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Progress {
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
  class Spec ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class TAP ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.Base
  
  @js.native
  class XUnit protected ()
    extends typings.jqueryDotAjaxfile.Mocha.reporters.XUnit {
    def this(runner: IRunner) = this()
    def this(runner: IRunner, options: js.Any) = this()
  }
  
}

