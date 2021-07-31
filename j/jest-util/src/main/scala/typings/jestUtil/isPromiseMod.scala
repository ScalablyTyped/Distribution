package typings.jestUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPromiseMod {
  
  @JSImport("jest-util/build/isPromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(candidate: js.Any): /* is std.Promise<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(candidate.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<unknown> */ Boolean]
}
