package typings.jqueryAjaxfile.mochaMod

import typings.jqueryAjaxfile.AnonClose
import typings.jqueryAjaxfile.Mocha_.IRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mocha", "reporters")
@js.native
object reporters extends js.Object {
  @js.native
  class Base protected ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base {
    def this(runner: IRunner) = this()
  }
  
  @js.native
  class Doc ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class Dot ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class HTML ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class HTMLCov ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class JSON ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class JSONCov ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class JSONStream ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class Landing ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class List ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class Markdown ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class Min ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class Nyan ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class Progress protected ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Progress {
    /**
      * @param options.open String used to indicate the start of the progress bar.
      * @param options.complete String used to indicate a complete test on the progress bar.
      * @param options.incomplete String used to indicate an incomplete test on the progress bar.
      * @param options.close String used to indicate the end of the progress bar.
      */
    def this(runner: IRunner) = this()
    def this(runner: IRunner, options: AnonClose) = this()
  }
  
  @js.native
  class Spec ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class TAP ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.Base
  
  @js.native
  class XUnit protected ()
    extends typings.jqueryAjaxfile.Mocha_.reporters.XUnit {
    def this(runner: IRunner) = this()
    def this(runner: IRunner, options: js.Any) = this()
  }
  
}

