package typings.jqueryAjaxfile

import typings.jqueryAjaxfile.Mocha.IRunner
import typings.jqueryAjaxfile.anon.Bail
import typings.jqueryAjaxfile.anon.Close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mochaMod {
  
  @JSImport("mocha", JSImport.Namespace)
  @js.native
  class ^ () extends Mocha {
    def this(options: Bail) = this()
  }
  
  object reporters {
    
    @JSImport("mocha", "reporters.Base")
    @js.native
    class Base protected ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base {
      def this(runner: IRunner) = this()
    }
    
    @JSImport("mocha", "reporters.Doc")
    @js.native
    class Doc ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.Dot")
    @js.native
    class Dot ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.HTML")
    @js.native
    class HTML ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.HTMLCov")
    @js.native
    class HTMLCov ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.JSON")
    @js.native
    class JSON ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.JSONCov")
    @js.native
    class JSONCov ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.JSONStream")
    @js.native
    class JSONStream ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.Landing")
    @js.native
    class Landing ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.List")
    @js.native
    class List ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.Markdown")
    @js.native
    class Markdown ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.Min")
    @js.native
    class Min ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.Nyan")
    @js.native
    class Nyan ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.Progress")
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
    
    @JSImport("mocha", "reporters.Spec")
    @js.native
    class Spec ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.TAP")
    @js.native
    class TAP ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base
    
    @JSImport("mocha", "reporters.XUnit")
    @js.native
    class XUnit protected ()
      extends typings.jqueryAjaxfile.Mocha.reporters.Base {
      def this(runner: IRunner) = this()
      def this(runner: IRunner, options: js.Any) = this()
    }
  }
}
