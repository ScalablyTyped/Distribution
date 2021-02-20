package typings.karmaChaiSinon

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.AssertStatic
import typings.chai.Chai.ExpectStatic
import typings.chai.Chai.Should
import typings.sinon.mod.SinonFakeXMLHttpRequest
import typings.sinon.mod.SinonStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @JSGlobal("assert")
    @js.native
    def assert: AssertStatic = js.native
    @scala.inline
    def assert_=(x: AssertStatic): Unit = js.Dynamic.global.updateDynamic("assert")(x.asInstanceOf[js.Any])
    
    @JSGlobal("expect")
    @js.native
    def expect: ExpectStatic = js.native
    @scala.inline
    def expect_=(x: ExpectStatic): Unit = js.Dynamic.global.updateDynamic("expect")(x.asInstanceOf[js.Any])
    
    @JSGlobal("should")
    @js.native
    def should: Should = js.native
    @scala.inline
    def should_=(x: Should): Unit = js.Dynamic.global.updateDynamic("should")(x.asInstanceOf[js.Any])
    
    object sinon extends Shortcut {
      
      @JSGlobal("sinon")
      @js.native
      val ^ : SinonStatic = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("sinon.FakeXMLHttpRequest")
      @js.native
      class FakeXMLHttpRequest () extends SinonFakeXMLHttpRequest
      
      type _To = SinonStatic
      
      /* This means you don't have to write `^`, but can instead just say `sinon.foo` */
      override def _to: SinonStatic = ^
    }
  }
}
