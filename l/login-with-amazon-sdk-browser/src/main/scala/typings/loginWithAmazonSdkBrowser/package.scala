package typings.loginWithAmazonSdkBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AuthorizeScope = AuthorizationScopeOptions | js.Array[AuthorizationScopeOptions]

/**
  * Type of callback invoked after `authorize` completes.
  */
type NextCallback[T /* <: AuthorizeRequest */] = js.Function1[/* response */ T, Unit]

type RetrieveProfileCallback = js.Function1[/* response */ RetrieveProfileResponse, Unit]
