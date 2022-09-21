package typings.jqueryAjaxfile

import org.scalablytyped.runtime.Shortcut
import typings.jqueryAjaxfile.Chai.ChaiStatic
import typings.jqueryAjaxfile.Mocha.IContextDefinition
import typings.jqueryAjaxfile.Mocha.IRunner
import typings.jqueryAjaxfile.Mocha.ITestDefinition
import typings.jqueryAjaxfile.anon.Bail
import typings.jqueryAjaxfile.anon.Close
import typings.jqueryAjaxfile.anon.Failures
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("AjaxFile")
  @js.native
  def AjaxFile: IAjaxFileStatic = js.native
  inline def AjaxFile_=(x: IAjaxFileStatic): Unit = js.Dynamic.global.updateDynamic("AjaxFile")(x.asInstanceOf[js.Any])
  
  object Chai_ {
    
    @JSGlobal("Chai.AssertionError")
    @js.native
    open class AssertionError protected ()
      extends StObject
         with typings.jqueryAjaxfile.Chai.AssertionError {
      def this(message: String) = this()
      def this(message: String, _props: Any) = this()
      def this(message: String, _props: Any, ssf: js.Function) = this()
      def this(message: String, _props: Unit, ssf: js.Function) = this()
      
      /* CompleteClass */
      var message: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      var showDiff: Boolean = js.native
      
      /* CompleteClass */
      var stack: String = js.native
    }
  }
  
  @JSGlobal("DataType")
  @js.native
  object DataType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.jqueryAjaxfile.DataType & Double] = js.native
    
    /* 0 */ val Json: typings.jqueryAjaxfile.DataType.Json & Double = js.native
    
    /* 2 */ val Text: typings.jqueryAjaxfile.DataType.Text & Double = js.native
    
    /* 1 */ val Xml: typings.jqueryAjaxfile.DataType.Xml & Double = js.native
  }
  
  @JSGlobal("Mocha")
  @js.native
  open class Mocha_ ()
    extends StObject
       with Mocha {
    def this(options: Bail) = this()
  }
  // merge the Mocha class declaration with a module
  object Mocha_ {
    
    object reporters {
      
      @JSGlobal("Mocha.reporters.Base")
      @js.native
      open class Base protected ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        def this(runner: IRunner) = this()
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.Doc")
      @js.native
      open class Doc ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.Dot")
      @js.native
      open class Dot ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.HTML")
      @js.native
      open class HTML ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.HTMLCov")
      @js.native
      open class HTMLCov ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.JSON")
      @js.native
      open class JSON ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.JSONCov")
      @js.native
      open class JSONCov ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.JSONStream")
      @js.native
      open class JSONStream ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.Landing")
      @js.native
      open class Landing ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.List")
      @js.native
      open class List ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.Markdown")
      @js.native
      open class Markdown ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.Min")
      @js.native
      open class Min ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.Nyan")
      @js.native
      open class Nyan ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.Progress")
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
      
      @JSGlobal("Mocha.reporters.Spec")
      @js.native
      open class Spec ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.TAP")
      @js.native
      open class TAP ()
        extends StObject
           with typings.jqueryAjaxfile.Mocha.reporters.Base {
        
        /* CompleteClass */
        var stats: Failures = js.native
      }
      
      @JSGlobal("Mocha.reporters.XUnit")
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
  
  object _empty extends Shortcut {
    
    @JSGlobal("$")
    @js.native
    val ^ : JQueryStatic = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("$.Event")
    @js.native
    open class Event protected ()
      extends StObject
         with JQueryEventObject {
      def this(name: String) = this()
      def this(name: String, eventProperties: Any) = this()
    }
    
    type _To = JQueryStatic
    
    /* This means you don't have to write `^`, but can instead just say `_empty.foo` */
    override def _to: JQueryStatic = ^
  }
  
  inline def after(action: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("after")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def after(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.Dynamic.global.applyDynamic("after")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def afterEach(action: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("afterEach")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterEach(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.Dynamic.global.applyDynamic("afterEach")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def before(action: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("before")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def before(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.Dynamic.global.applyDynamic("before")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def beforeEach(action: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("beforeEach")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeEach(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.Dynamic.global.applyDynamic("beforeEach")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSGlobal("chai")
  @js.native
  def chai: ChaiStatic = js.native
  inline def chai_=(x: ChaiStatic): Unit = js.Dynamic.global.updateDynamic("chai")(x.asInstanceOf[js.Any])
  
  // alias for `describe`
  @JSGlobal("context")
  @js.native
  def context: IContextDefinition = js.native
  inline def context_=(x: IContextDefinition): Unit = js.Dynamic.global.updateDynamic("context")(x.asInstanceOf[js.Any])
  
  @JSGlobal("describe")
  @js.native
  def describe: IContextDefinition = js.native
  inline def describe_=(x: IContextDefinition): Unit = js.Dynamic.global.updateDynamic("describe")(x.asInstanceOf[js.Any])
  
  @JSGlobal("it")
  @js.native
  def it: ITestDefinition = js.native
  inline def it_=(x: ITestDefinition): Unit = js.Dynamic.global.updateDynamic("it")(x.asInstanceOf[js.Any])
  
  object jQuery extends Shortcut {
    
    @JSGlobal("jQuery")
    @js.native
    val ^ : JQueryStatic = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("jQuery.Event")
    @js.native
    open class Event protected ()
      extends StObject
         with JQueryEventObject {
      def this(name: String) = this()
      def this(name: String, eventProperties: Any) = this()
    }
    
    type _To = JQueryStatic
    
    /* This means you don't have to write `^`, but can instead just say `jQuery.foo` */
    override def _to: JQueryStatic = ^
  }
  
  object ko extends Shortcut {
    
    @JSGlobal("ko")
    @js.native
    val ^ : KnockoutStatic = js.native
    
    /////////////////////////////////
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.bindingProvider")
    @js.native
    open class bindingProvider ()
      extends StObject
         with KnockoutBindingProvider {
      
      /* CompleteClass */
      override def getBindings(node: Node, bindingContext: KnockoutBindingContext): js.Object = js.native
      
      /* CompleteClass */
      override def nodeHasBindings(node: Node): Boolean = js.native
    }
    
    //////////////////////////////////
    // nativeTemplateEngine.js
    //////////////////////////////////
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.nativeTemplateEngine")
    @js.native
    open class nativeTemplateEngine ()
      extends StObject
         with KnockoutNativeTemplateEngine
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.subscribable")
    @js.native
    open class subscribable[T] ()
      extends StObject
         with KnockoutSubscribable[T]
    
    //////////////////////////////////
    // templateEngine.js
    //////////////////////////////////
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.templateEngine")
    @js.native
    open class templateEngine ()
      extends StObject
         with KnockoutTemplateEngine
    
    type _To = KnockoutStatic
    
    /* This means you don't have to write `^`, but can instead just say `ko.foo` */
    override def _to: KnockoutStatic = ^
  }
  
  @JSGlobal("mocha")
  @js.native
  def mocha: Mocha = js.native
  inline def mocha_=(x: Mocha): Unit = js.Dynamic.global.updateDynamic("mocha")(x.asInstanceOf[js.Any])
  
  inline def setup(action: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("setup")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setup(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.Dynamic.global.applyDynamic("setup")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  // alias for `describe`
  @JSGlobal("suite")
  @js.native
  def suite: IContextDefinition = js.native
  
  inline def suiteSetup(action: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("suiteSetup")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def suiteSetup(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.Dynamic.global.applyDynamic("suiteSetup")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def suiteTeardown(action: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("suiteTeardown")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def suiteTeardown(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.Dynamic.global.applyDynamic("suiteTeardown")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def suite_=(x: IContextDefinition): Unit = js.Dynamic.global.updateDynamic("suite")(x.asInstanceOf[js.Any])
  
  inline def teardown(action: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("teardown")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def teardown(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.Dynamic.global.applyDynamic("teardown")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  // alias for `it`
  @JSGlobal("test")
  @js.native
  def test: ITestDefinition = js.native
  inline def test_=(x: ITestDefinition): Unit = js.Dynamic.global.updateDynamic("test")(x.asInstanceOf[js.Any])
  
  @JSGlobal("xdescribe")
  @js.native
  def xdescribe: IContextDefinition = js.native
  inline def xdescribe_=(x: IContextDefinition): Unit = js.Dynamic.global.updateDynamic("xdescribe")(x.asInstanceOf[js.Any])
  
  @JSGlobal("xit")
  @js.native
  def xit: ITestDefinition = js.native
  inline def xit_=(x: ITestDefinition): Unit = js.Dynamic.global.updateDynamic("xit")(x.asInstanceOf[js.Any])
}
