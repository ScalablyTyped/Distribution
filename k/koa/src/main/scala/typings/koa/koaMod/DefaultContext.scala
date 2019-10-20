package typings.koa.koaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface can be augmented by users to add types to Koa's default context
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Lifted 0 members from Set(koa.koa.DefaultContextExtends) */ trait DefaultContext
  extends /**
  * Custom properties.
  */
/* key */ StringDictionary[js.Any]

object DefaultContext {
  @scala.inline
  def apply(StringDictionary: /**
    * Custom properties.
    */
  /* key */ StringDictionary[js.Any] = null): DefaultContext = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DefaultContext]
  }
}

