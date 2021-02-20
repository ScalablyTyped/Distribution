package typings.lodash.fpMod

import typings.lodash.mod.PartialObject
import typings.lodash.mod.PropertyPath
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPick extends StObject {
  
  def apply(props: PropertyPath): LodashPick2x1 = js.native
  def apply[T](props: PropertyPath, `object`: T): PartialObject[T] = js.native
  def apply[T](props: __): LodashPick2x2[T] = js.native
  def apply[T /* <: js.Object */](props: __, `object`: T): LodashPick1x2[T] = js.native
}
