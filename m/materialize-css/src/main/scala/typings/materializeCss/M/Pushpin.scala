package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<PushpinOptions> * / any */ trait Pushpin extends js.Object {
  /**
    * Original offsetTop of element
    */
  var originalOffset: Double
}

object Pushpin {
  @scala.inline
  def apply(originalOffset: Double): Pushpin = {
    val __obj = js.Dynamic.literal(originalOffset = originalOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pushpin]
  }
}

