package typings.ipfsRepoMigrations

import typings.ipfsRepoMigrations.distSrcTypesMod.Migration
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMigrationsMigration9Mod {
  
  @JSImport("ipfs-repo-migrations/dist/src/migrations/migration-9", "migration")
  @js.native
  val migration: Migration_ = js.native
  
  type Blockstore = typings.interfaceBlockstore.mod.Blockstore[js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object, js.Object]
  
  type CIDVersion = Version
  
  type Datastore = typings.interfaceDatastore.mod.Datastore[
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object
  ]
  
  type MigrationProgressCallback = typings.ipfsRepoMigrations.distSrcTypesMod.MigrationProgressCallback
  
  type Migration_ = Migration
}
