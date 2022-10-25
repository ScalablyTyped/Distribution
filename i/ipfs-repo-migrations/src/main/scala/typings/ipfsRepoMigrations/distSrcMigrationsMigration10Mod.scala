package typings.ipfsRepoMigrations

import typings.ipfsRepoMigrations.distSrcTypesMod.Migration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMigrationsMigration10Mod {
  
  @JSImport("ipfs-repo-migrations/dist/src/migrations/migration-10", "migration")
  @js.native
  val migration: Migration_ = js.native
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore
  
  type Datastore = typings.interfaceDatastore.mod.Datastore
  
  type DowngradeFunction = js.Function2[
    /* arg0 */ js.typedarray.Uint8Array, 
    /* arg1 */ js.typedarray.Uint8Array, 
    js.Array[Operation]
  ]
  
  type MigrationProgressCallback = typings.ipfsRepoMigrations.distSrcTypesMod.MigrationProgressCallback
  
  type Migration_ = Migration
  
  /* Rewritten from type alias, can be one of: 
    - typings.ipfsRepoMigrations.anon.Key
    - typings.ipfsRepoMigrations.anon.Type
  */
  trait Operation extends StObject
  object Operation {
    
    inline def Key(key: String | js.typedarray.Uint8Array): typings.ipfsRepoMigrations.anon.Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("del")
      __obj.asInstanceOf[typings.ipfsRepoMigrations.anon.Key]
    }
    
    inline def Type(key: String | js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): typings.ipfsRepoMigrations.anon.Type = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("put")
      __obj.asInstanceOf[typings.ipfsRepoMigrations.anon.Type]
    }
  }
  
  type UpgradeFunction = js.Function2[/* arg0 */ String, /* arg1 */ js.typedarray.Uint8Array, js.Array[Operation]]
}
