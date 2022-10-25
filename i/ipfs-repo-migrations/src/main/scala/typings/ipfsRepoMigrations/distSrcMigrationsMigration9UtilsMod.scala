package typings.ipfsRepoMigrations

import typings.interfaceDatastore.keyMod.Key
import typings.ipfsRepoMigrations.ipfsRepoMigrationsInts.`256`
import typings.ipfsRepoMigrations.ipfsRepoMigrationsInts.`8192`
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMigrationsMigration9UtilsMod {
  
  @JSImport("ipfs-repo-migrations/dist/src/migrations/migration-9/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipfs-repo-migrations/dist/src/migrations/migration-9/utils", "DEFAULT_FANOUT")
  @js.native
  val DEFAULT_FANOUT: `256` = js.native
  
  @JSImport("ipfs-repo-migrations/dist/src/migrations/migration-9/utils", "EMPTY_KEY")
  @js.native
  val EMPTY_KEY: CID[Any, Double, Double, Version] = js.native
  
  @JSImport("ipfs-repo-migrations/dist/src/migrations/migration-9/utils", "MAX_ITEMS")
  @js.native
  val MAX_ITEMS: `8192` = js.native
  
  @JSImport("ipfs-repo-migrations/dist/src/migrations/migration-9/utils", "PIN_DS_KEY")
  @js.native
  val PIN_DS_KEY: Key = js.native
  
  object PinTypes {
    
    @JSImport("ipfs-repo-migrations/dist/src/migrations/migration-9/utils", "PinTypes.direct")
    @js.native
    val direct: String = js.native
    
    @JSImport("ipfs-repo-migrations/dist/src/migrations/migration-9/utils", "PinTypes.recursive")
    @js.native
    val recursive: String = js.native
  }
  
  inline def cidToKey(cid: typings.multiformats.mod.CID[Any, Double, Double, Version]): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("cidToKey")(cid.asInstanceOf[js.Any]).asInstanceOf[Key]
}
