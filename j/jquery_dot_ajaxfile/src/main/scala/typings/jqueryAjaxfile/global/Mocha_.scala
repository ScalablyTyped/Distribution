package typings.jqueryAjaxfile.global

import typings.jqueryAjaxfile.Mocha
import typings.jqueryAjaxfile.Mocha.IRunner
import typings.jqueryAjaxfile.anon.Bail
import typings.jqueryAjaxfile.anon.Close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Mocha")
@js.native
class Mocha_ () extends Mocha {
  def this(options: Bail) = this()
}
// merge the Mocha class declaration with a module
@JSGlobal("Mocha")
@js.native
object Mocha_ extends js.Object {
  
  @js.native
  object reporters extends js.Object {
    
    @js.native
    class Base protected ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base {
      def this(runner: IRunner) = this()
    }
    
    @js.native
    class Doc ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class Dot ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class HTML ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class HTMLCov ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class JSON ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class JSONCov ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class JSONStream ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class Landing ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class List ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class Markdown ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class Min ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class Nyan ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class Progress protected ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base {
      /**
        * @param options.open String used to indicate the start of the progress bar.
        * @param options.complete String used to indicate a complete test on the progress bar.
        * @param options.incomplete String used to indicate an incomplete test on the progress bar.
        * @param options.close String used to indicate the end of the progress bar.
        */
      def this(runner: IRunner) = this()
      def this(runner: IRunner, options: Close) = this()
    }
    
    @js.native
    class Spec ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class TAP ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @js.native
    class XUnit protected ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base {
      def this(runner: IRunner) = this()
      def this(runner: IRunner, options: js.Any) = this()
    }
  }
}
