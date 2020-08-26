package typings.koa.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface can be augmented by users to add types to Koa's default context
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Lifted 0 members from Set(koa.koa.DefaultContextExtends) */ @js.native
trait DefaultContext
  extends /**
  * Custom properties.
  */
/* key */ StringDictionary[js.Any]

object DefaultContext {
  @scala.inline
  def apply(): DefaultContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultContext]
  }
}

