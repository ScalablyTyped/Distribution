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
  open class ^ ()
    extends StObject
       with Mocha {
    def this(options: Bail) = this()
  }
  
  object reporters {
    
    @JSImport("mocha", "reporters.Base")
    @js.native
    open class Base protected ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      def this(runner: IRunner) = this()
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Doc")
    @js.native
    open class Doc ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Dot")
    @js.native
    open class Dot ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.HTML")
    @js.native
    open class HTML ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.HTMLCov")
    @js.native
    open class HTMLCov ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.JSON")
    @js.native
    open class JSON ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.JSONCov")
    @js.native
    open class JSONCov ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.JSONStream")
    @js.native
    open class JSONStream ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Landing")
    @js.native
    open class Landing ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.List")
    @js.native
    open class List ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Markdown")
    @js.native
    open class Markdown ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Min")
    @js.native
    open class Min ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Nyan")
    @js.native
    open class Nyan ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.Progress")
    @js.native
    open class Progress protected ()
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
    open class Spec ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.TAP")
    @js.native
    open class TAP ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
    
    @JSImport("mocha", "reporters.XUnit")
    @js.native
    open class XUnit protected ()
      extends StObject
         with typings.jqueryAjaxfile.Mocha.reporters.Base {
      def this(runner: IRunner) = this()
      def this(runner: IRunner, options: Any) = this()
      
      /* CompleteClass */
      var stats: Failures = js.native
    }
  }
}
