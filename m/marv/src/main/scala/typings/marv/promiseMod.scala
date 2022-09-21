package typings.marv

import typings.marv.anon.Quiet
import typings.marv.mod.Driver
import typings.marv.mod.ParsedMigration
import typings.marv.mod.ScanOptions
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  @JSImport("marv/api/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drop(driver: Driver): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("drop")(driver.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def migrate(migrations: js.Array[ParsedMigration], driver: Driver): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(migrations.asInstanceOf[js.Any], driver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def migrate(migrations: js.Array[ParsedMigration], driver: Driver, options: Quiet): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(migrations.asInstanceOf[js.Any], driver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def scan(directory: PathLike): js.Promise[js.Array[ParsedMigration]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(directory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ParsedMigration]]]
  inline def scan(directory: PathLike, options: ScanOptions): js.Promise[js.Array[ParsedMigration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(directory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ParsedMigration]]]
}
