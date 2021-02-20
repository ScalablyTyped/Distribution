package typings.jasminewd2

import typings.jasmine.DoneFn
import typings.jasminewd2.jasmine.AsyncCustomMatcherFactories
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("afterAll")
  @js.native
  def afterAll(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  @JSGlobal("afterAll")
  @js.native
  def afterAll(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
  
  @JSGlobal("afterEach")
  @js.native
  def afterEach(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  @JSGlobal("afterEach")
  @js.native
  def afterEach(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
  
  @JSGlobal("beforeAll")
  @js.native
  def beforeAll(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  @JSGlobal("beforeAll")
  @js.native
  def beforeAll(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
  
  @JSGlobal("beforeEach")
  @js.native
  def beforeEach(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  @JSGlobal("beforeEach")
  @js.native
  def beforeEach(action: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
  
  @JSGlobal("fit")
  @js.native
  def fit(expectation: String): Unit = js.native
  @JSGlobal("fit")
  @js.native
  def fit(expectation: String, assertion: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  @JSGlobal("fit")
  @js.native
  def fit(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  @JSGlobal("fit")
  @js.native
  def fit(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
  
  @JSGlobal("it")
  @js.native
  def it(expectation: String): Unit = js.native
  @JSGlobal("it")
  @js.native
  def it(expectation: String, assertion: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  @JSGlobal("it")
  @js.native
  def it(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  @JSGlobal("it")
  @js.native
  def it(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
  
  object jasmine {
    
    @JSGlobal("jasmine.addMatchers")
    @js.native
    def addMatchers(matchers: AsyncCustomMatcherFactories): Unit = js.native
  }
  
  @JSGlobal("xit")
  @js.native
  def xit(expectation: String): Unit = js.native
  @JSGlobal("xit")
  @js.native
  def xit(expectation: String, assertion: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  @JSGlobal("xit")
  @js.native
  def xit(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]]): Unit = js.native
  @JSGlobal("xit")
  @js.native
  def xit(expectation: String, assertion: js.Function1[/* done */ DoneFn, js.Promise[Unit]], timeout: Double): Unit = js.native
}
