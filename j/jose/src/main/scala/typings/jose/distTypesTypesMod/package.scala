package typings.jose.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DeflateFunction = js.Function1[/* input */ js.typedarray.Uint8Array, js.Promise[js.typedarray.Uint8Array]]

type GeneralDecryptResult = FlattenedDecryptResult

type GeneralVerifyResult = FlattenedVerifyResult

type GetKeyFunction[T, T2] = js.Function2[
/* protectedHeader */ T, 
/* token */ T2, 
(js.Promise[KeyLike | js.typedarray.Uint8Array]) | KeyLike | js.typedarray.Uint8Array]

type InflateFunction = js.Function1[/* input */ js.typedarray.Uint8Array, js.Promise[js.typedarray.Uint8Array]]

type SignOptions = CritOption
