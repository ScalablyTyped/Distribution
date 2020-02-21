package typings.jestMatcherUtils.replaceableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-matcher-utils/build/Replaceable", JSImport.Default)
@js.native
class default protected () extends Replaceable {
  def this(`object`: js.Any) = this()
  /* CompleteClass */
  override var `object`: js.Any = js.native
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override def forEach(cb: ReplaceableForEachCallBack): Unit = js.native
  /* CompleteClass */
  override def get(key: js.Any): js.Any = js.native
  /* CompleteClass */
  override def set(key: js.Any, value: js.Any): Unit = js.native
}

/* static members */
@JSImport("jest-matcher-utils/build/Replaceable", JSImport.Default)
@js.native
object default extends js.Object {
  def isReplaceable(obj1: js.Any, obj2: js.Any): Boolean = js.native
}

