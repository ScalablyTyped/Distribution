package typings.leafletDashLabel.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureGroup[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ILayer */ js.Any */] extends js.Object {
  def bindLabel(content: String): FeatureGroup[T] = js.native
  def bindLabel(content: String, options: LabelOptions): FeatureGroup[T] = js.native
  def clearLayers(): FeatureGroup[T] = js.native
  def unbindLabel(): FeatureGroup[T] = js.native
  def updateLabelContent(content: String): FeatureGroup[T] = js.native
}

