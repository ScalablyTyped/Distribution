package typings.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends StObject {
  
  /**
    * @default undefined
    * @description When karma run is passed additional arguments on the command-line, they
    * are passed through to the test adapter as karma.config.args (an array of strings).
    * The client.args option allows you to set this value for actions other than run.
    * How this value is used is up to your test adapter - you should check your adapter's
    * documentation to see how (and if) it uses this value.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @default true
    * @description Capture all console output and pipe it to the terminal.
    */
  var captureConsole: js.UndefOr[Boolean] = js.native
  
  /**
    * @default true
    * @description Clear the context window
    * If true, Karma clears the context window upon the completion of running the tests.
    * If false, Karma does not clear the context window upon the completion of running the tests.
    * Setting this to false is useful when embedding a Jasmine Spec Runner Template.
    */
  var clearContext: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    * @description Set style display none on client elements.
    * If true, Karma does not display the banner and browser list.
    * Useful when using karma on component tests with screenshots
    */
  var clientDisplayNone: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    * @description Run the tests on the same window as the client, without using iframe or a new window
    */
  var runInParent: js.UndefOr[Boolean] = js.native
  
  /**
    * @default true
    * @description Run the tests inside an iFrame or a new window
    * If true, Karma runs the tests inside an iFrame. If false, Karma runs the tests in a new window. Some tests may not run in an
    * iFrame and may need a new window to run.
    */
  var useIframe: js.UndefOr[Boolean] = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setCaptureConsole(value: Boolean): Self = StObject.set(x, "captureConsole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureConsoleUndefined: Self = StObject.set(x, "captureConsole", js.undefined)
    
    @scala.inline
    def setClearContext(value: Boolean): Self = StObject.set(x, "clearContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearContextUndefined: Self = StObject.set(x, "clearContext", js.undefined)
    
    @scala.inline
    def setClientDisplayNone(value: Boolean): Self = StObject.set(x, "clientDisplayNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDisplayNoneUndefined: Self = StObject.set(x, "clientDisplayNone", js.undefined)
    
    @scala.inline
    def setRunInParent(value: Boolean): Self = StObject.set(x, "runInParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunInParentUndefined: Self = StObject.set(x, "runInParent", js.undefined)
    
    @scala.inline
    def setUseIframe(value: Boolean): Self = StObject.set(x, "useIframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseIframeUndefined: Self = StObject.set(x, "useIframe", js.undefined)
  }
}
