package typings.lodash.fpMod

import typings.lodash.mod.PropertyPath
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashUpdate extends StObject {
  
  def apply(path: PropertyPath): LodashUpdate1x1 = js.native
  def apply(path: PropertyPath, updater: js.Function1[/* value */ js.Any, js.Any]): LodashUpdate1x3 = js.native
  def apply(path: PropertyPath, updater: js.Function1[/* value */ js.Any, js.Any], `object`: js.Object): js.Any = js.native
  def apply(path: PropertyPath, updater: __, `object`: js.Object): LodashUpdate1x5 = js.native
  def apply(path: __, updater: js.Function1[/* value */ js.Any, js.Any]): LodashUpdate1x2 = js.native
  def apply(path: __, updater: js.Function1[/* value */ js.Any, js.Any], `object`: js.Object): LodashUpdate1x6 = js.native
  def apply(path: __, updater: __, `object`: js.Object): LodashUpdate1x4 = js.native
}
