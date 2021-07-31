package typings.jqueryAjaxfile

import typings.jqueryAjaxfile.Mocha.IRunner
import typings.jqueryAjaxfile.anon.Bail
import typings.jqueryAjaxfile.anon.Close
import typings.jqueryAjaxfile.anon.Failures
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mochaMod {
  
  @JSImport("mocha", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Mocha {
    def this(options: Bail) = this()
  }
  
  object reporters {
    
    @JSImport("mocha", "reporters.Base")
    @js.native
    class Base protected ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      def this(runner: IRunner) = this()
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Doc")
    @js.native
    class Doc ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Dot")
    @js.native
    class Dot ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.HTML")
    @js.native
    class HTML ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.HTMLCov")
    @js.native
    class HTMLCov ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.JSON")
    @js.native
    class JSON ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.JSONCov")
    @js.native
    class JSONCov ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.JSONStream")
    @js.native
    class JSONStream ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Landing")
    @js.native
    class Landing ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.List")
    @js.native
    class List ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Markdown")
    @js.native
    class Markdown ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Min")
    @js.native
    class Min ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Nyan")
    @js.native
    class Nyan ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Progress")
    @js.native
    class Progress protected ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      /**
        * @param options.open String used to indicate the start of the progress bar.
        * @param options.complete String used to indicate a complete test on the progress bar.
        * @param options.incomplete String used to indicate an incomplete test on the progress bar.
        * @param options.close String used to indicate the end of the progress bar.
        */
      def this(runner: IRunner) = this()
      def this(runner: IRunner, options: Close) = this()
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Spec")
    @js.native
    class Spec ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.TAP")
    @js.native
    class TAP ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.XUnit")
    @js.native
    class XUnit protected ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      def this(runner: IRunner) = this()
      def this(runner: IRunner, options: js.Any) = this()
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
  }
}
