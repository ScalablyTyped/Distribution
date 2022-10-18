package typings.libp2pInterfaceDht.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type MessageName = /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String

type SelectFn = js.Function2[
/* key */ js.typedarray.Uint8Array, 
/* records */ js.Array[js.typedarray.Uint8Array], 
Double]

type Selectors = Record[String, SelectFn]

type ValidateFn = js.Function2[
/* key */ js.typedarray.Uint8Array, 
/* value */ js.typedarray.Uint8Array, 
js.Promise[Unit]]

type Validators = Record[String, ValidateFn]
