package typings.ipfsRepoMigrations

import org.scalablytyped.runtime.Shortcut
import typings.ipfsRepoMigrations.distSrcTypesMod.Migration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMigrationsMod extends Shortcut {
  
  @JSImport("ipfs-repo-migrations/dist/src/migrations", JSImport.Default)
  @js.native
  val default: js.Array[Migration] = js.native
  
  type _To = js.Array[Migration]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcMigrationsMod.foo` */
  override def _to: js.Array[Migration] = default
}
