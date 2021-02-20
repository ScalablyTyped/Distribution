package typings.jqueryAjaxfile

import org.scalablytyped.runtime.Shortcut
import typings.jqueryAjaxfile.Chai.ChaiStatic
import typings.jqueryAjaxfile.Mocha.IContextDefinition
import typings.jqueryAjaxfile.Mocha.IRunner
import typings.jqueryAjaxfile.Mocha.ITestDefinition
import typings.jqueryAjaxfile.anon.Bail
import typings.jqueryAjaxfile.anon.Close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("AjaxFile")
  @js.native
  def AjaxFile: IAjaxFileStatic = js.native
  @scala.inline
  def AjaxFile_=(x: IAjaxFileStatic): Unit = js.Dynamic.global.updateDynamic("AjaxFile")(x.asInstanceOf[js.Any])
  
  object Chai_ {
    
    @JSGlobal("Chai.AssertionError")
    @js.native
    class AssertionError protected ()
      extends typings.jqueryAjaxfile.Chai.AssertionError {
      def this(message: String) = this()
      def this(message: String, _props: js.Any) = this()
      def this(message: String, _props: js.UndefOr[scala.Nothing], ssf: js.Function) = this()
      def this(message: String, _props: js.Any, ssf: js.Function) = this()
    }
  }
  
  @JSGlobal("DataType")
  @js.native
  object DataType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.jqueryAjaxfile.DataType with Double] = js.native
    
    /* 0 */ val Json: typings.jqueryAjaxfile.DataType.Json with Double = js.native
    
    /* 2 */ val Text: typings.jqueryAjaxfile.DataType.Text with Double = js.native
    
    /* 1 */ val Xml: typings.jqueryAjaxfile.DataType.Xml with Double = js.native
  }
  
  @JSGlobal("Mocha")
  @js.native
  class Mocha_ () extends Mocha {
    def this(options: Bail) = this()
  }
  // merge the Mocha class declaration with a module
  object Mocha_ {
    
    object reporters {
      
      @JSGlobal("Mocha.reporters.Base")
      @js.native
      class Base protected ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base {
        def this(runner: IRunner) = this()
      }
      
      @JSGlobal("Mocha.reporters.Doc")
      @js.native
      class Doc ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.Dot")
      @js.native
      class Dot ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.HTML")
      @js.native
      class HTML ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.HTMLCov")
      @js.native
      class HTMLCov ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.JSON")
      @js.native
      class JSON ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.JSONCov")
      @js.native
      class JSONCov ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.JSONStream")
      @js.native
      class JSONStream ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.Landing")
      @js.native
      class Landing ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.List")
      @js.native
      class List ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.Markdown")
      @js.native
      class Markdown ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.Min")
      @js.native
      class Min ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.Nyan")
      @js.native
      class Nyan ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.Progress")
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
      
      @JSGlobal("Mocha.reporters.Spec")
      @js.native
      class Spec ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.TAP")
      @js.native
      class TAP ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base
      
      @JSGlobal("Mocha.reporters.XUnit")
      @js.native
      class XUnit protected ()
        extends typings.jqueryAjaxfile.Mocha.reporters.Base {
        def this(runner: IRunner) = this()
        def this(runner: IRunner, options: js.Any) = this()
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
    class Event protected () extends JQueryEventObject {
      def this(name: String) = this()
      def this(name: String, eventProperties: js.Any) = this()
    }
    
    type _To = JQueryStatic
    
    /* This means you don't have to write `^`, but can instead just say `_empty.foo` */
    override def _to: JQueryStatic = ^
  }
  
  @JSGlobal("after")
  @js.native
  def after(action: js.Function0[Unit]): Unit = js.native
  @JSGlobal("after")
  @js.native
  def after(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  
  @JSGlobal("afterEach")
  @js.native
  def afterEach(action: js.Function0[Unit]): Unit = js.native
  @JSGlobal("afterEach")
  @js.native
  def afterEach(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  
  @JSGlobal("before")
  @js.native
  def before(action: js.Function0[Unit]): Unit = js.native
  @JSGlobal("before")
  @js.native
  def before(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  
  @JSGlobal("beforeEach")
  @js.native
  def beforeEach(action: js.Function0[Unit]): Unit = js.native
  @JSGlobal("beforeEach")
  @js.native
  def beforeEach(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  
  @JSGlobal("chai")
  @js.native
  def chai: ChaiStatic = js.native
  @scala.inline
  def chai_=(x: ChaiStatic): Unit = js.Dynamic.global.updateDynamic("chai")(x.asInstanceOf[js.Any])
  
  // alias for `describe`
  @JSGlobal("context")
  @js.native
  def context: IContextDefinition = js.native
  @scala.inline
  def context_=(x: IContextDefinition): Unit = js.Dynamic.global.updateDynamic("context")(x.asInstanceOf[js.Any])
  
  @JSGlobal("describe")
  @js.native
  def describe: IContextDefinition = js.native
  @scala.inline
  def describe_=(x: IContextDefinition): Unit = js.Dynamic.global.updateDynamic("describe")(x.asInstanceOf[js.Any])
  
  @JSGlobal("it")
  @js.native
  def it: ITestDefinition = js.native
  @scala.inline
  def it_=(x: ITestDefinition): Unit = js.Dynamic.global.updateDynamic("it")(x.asInstanceOf[js.Any])
  
  object jQuery extends Shortcut {
    
    @JSGlobal("jQuery")
    @js.native
    val ^ : JQueryStatic = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("jQuery.Event")
    @js.native
    class Event protected () extends JQueryEventObject {
      def this(name: String) = this()
      def this(name: String, eventProperties: js.Any) = this()
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
    class bindingProvider () extends KnockoutBindingProvider
    
    //////////////////////////////////
    // nativeTemplateEngine.js
    //////////////////////////////////
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.nativeTemplateEngine")
    @js.native
    class nativeTemplateEngine () extends KnockoutNativeTemplateEngine
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.subscribable")
    @js.native
    class subscribable[T] () extends KnockoutSubscribable[T]
    
    //////////////////////////////////
    // templateEngine.js
    //////////////////////////////////
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.templateEngine")
    @js.native
    class templateEngine () extends KnockoutTemplateEngine
    
    type _To = KnockoutStatic
    
    /* This means you don't have to write `^`, but can instead just say `ko.foo` */
    override def _to: KnockoutStatic = ^
  }
  
  @JSGlobal("mocha")
  @js.native
  def mocha: Mocha = js.native
  @scala.inline
  def mocha_=(x: Mocha): Unit = js.Dynamic.global.updateDynamic("mocha")(x.asInstanceOf[js.Any])
  
  @JSGlobal("setup")
  @js.native
  def setup(action: js.Function0[Unit]): Unit = js.native
  @JSGlobal("setup")
  @js.native
  def setup(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  
  // alias for `describe`
  @JSGlobal("suite")
  @js.native
  def suite: IContextDefinition = js.native
  
  @JSGlobal("suiteSetup")
  @js.native
  def suiteSetup(action: js.Function0[Unit]): Unit = js.native
  @JSGlobal("suiteSetup")
  @js.native
  def suiteSetup(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  
  @JSGlobal("suiteTeardown")
  @js.native
  def suiteTeardown(action: js.Function0[Unit]): Unit = js.native
  @JSGlobal("suiteTeardown")
  @js.native
  def suiteTeardown(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  
  @scala.inline
  def suite_=(x: IContextDefinition): Unit = js.Dynamic.global.updateDynamic("suite")(x.asInstanceOf[js.Any])
  
  @JSGlobal("teardown")
  @js.native
  def teardown(action: js.Function0[Unit]): Unit = js.native
  @JSGlobal("teardown")
  @js.native
  def teardown(action: js.Function1[/* done */ MochaDone, Unit]): Unit = js.native
  
  // alias for `it`
  @JSGlobal("test")
  @js.native
  def test: ITestDefinition = js.native
  @scala.inline
  def test_=(x: ITestDefinition): Unit = js.Dynamic.global.updateDynamic("test")(x.asInstanceOf[js.Any])
  
  @JSGlobal("xdescribe")
  @js.native
  def xdescribe: IContextDefinition = js.native
  @scala.inline
  def xdescribe_=(x: IContextDefinition): Unit = js.Dynamic.global.updateDynamic("xdescribe")(x.asInstanceOf[js.Any])
  
  @JSGlobal("xit")
  @js.native
  def xit: ITestDefinition = js.native
  @scala.inline
  def xit_=(x: ITestDefinition): Unit = js.Dynamic.global.updateDynamic("xit")(x.asInstanceOf[js.Any])
  
  //
  // refactored types into a namespace to reduce global pollution 
  // and used Union Types to simplify overloads (requires TypeScript 1.4)
  //
  object KnockoutComponentTypes
}
