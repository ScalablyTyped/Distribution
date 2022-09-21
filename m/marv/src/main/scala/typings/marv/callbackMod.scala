package typings.marv

import typings.marv.anon.Quiet
import typings.marv.mod.Driver
import typings.marv.mod.ErrorOnlyCallback
import typings.marv.mod.ParsedMigration
import typings.marv.mod.ScanOptions
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbackMod {
  
  @JSImport("marv/api/callback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drop(driver: Driver): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("drop")(driver.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def drop(driver: Driver, cb: ErrorOnlyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drop")(driver.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def migrate(migrations: js.Array[ParsedMigration], driver: Driver, cb: ErrorOnlyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(migrations.asInstanceOf[js.Any], driver.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def migrate(migrations: js.Array[ParsedMigration], driver: Driver, options: Quiet, cb: ErrorOnlyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(migrations.asInstanceOf[js.Any], driver.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scan(
    directory: PathLike,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* migrations */ js.Array[ParsedMigration], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(directory.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scan(
    directory: PathLike,
    options: ScanOptions,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* migrations */ js.Array[ParsedMigration], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(directory.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
