package typings.interfaceBlockstore

import typings.interfaceStore.mod.Store
import typings.multiformats.linkInterfaceMod.Version
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Batch = typings.interfaceStore.mod.Batch[CID[Any, Double, Double, Version], js.typedarray.Uint8Array]
  
  type Blockstore = Store[CID[Any, Double, Double, Version], js.typedarray.Uint8Array]
  
  type KeyQuery = typings.interfaceStore.mod.KeyQuery[CID[Any, Double, Double, Version]]
  
  type KeyQueryFilter = typings.interfaceStore.mod.KeyQueryFilter[CID[Any, Double, Double, Version]]
  
  type KeyQueryOrder = typings.interfaceStore.mod.KeyQueryOrder[CID[Any, Double, Double, Version]]
  
  type Options = typings.interfaceStore.mod.Options
  
  type Pair = typings.interfaceStore.mod.Pair[CID[Any, Double, Double, Version], js.typedarray.Uint8Array]
  
  type Query = typings.interfaceStore.mod.Query[CID[Any, Double, Double, Version], js.typedarray.Uint8Array]
  
  type QueryFilter = typings.interfaceStore.mod.QueryFilter[CID[Any, Double, Double, Version], js.typedarray.Uint8Array]
  
  type QueryOrder = typings.interfaceStore.mod.QueryOrder[CID[Any, Double, Double, Version], js.typedarray.Uint8Array]
}
