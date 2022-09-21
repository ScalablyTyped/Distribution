package typings.interfaceBlockstore

import typings.interfaceStore.mod.Store
import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Batch = typings.interfaceStore.mod.Batch[CID, js.typedarray.Uint8Array]
  
  type Blockstore = Store[CID, js.typedarray.Uint8Array]
  
  type KeyQuery = typings.interfaceStore.mod.KeyQuery[CID]
  
  type KeyQueryFilter = typings.interfaceStore.mod.KeyQueryFilter[CID]
  
  type KeyQueryOrder = typings.interfaceStore.mod.KeyQueryOrder[CID]
  
  type Options = typings.interfaceStore.mod.Options
  
  type Pair = typings.interfaceStore.mod.Pair[CID, js.typedarray.Uint8Array]
  
  type Query = typings.interfaceStore.mod.Query[CID, js.typedarray.Uint8Array]
  
  type QueryFilter = typings.interfaceStore.mod.QueryFilter[CID, js.typedarray.Uint8Array]
  
  type QueryOrder = typings.interfaceStore.mod.QueryOrder[CID, js.typedarray.Uint8Array]
}
