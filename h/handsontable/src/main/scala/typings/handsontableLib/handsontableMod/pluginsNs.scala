package typings
package handsontableLib.handsontableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("handsontable", "plugins")
@js.native
object pluginsNs extends js.Object {
  @js.native
  class Base ()
    extends handsontableLib.handsontableMod.HandsontableNs.pluginsNs.Base {
    def this(hotInstance: handsontableLib.handsontableMod.underscoreHandsontableNs.Core) = this()
    /* CompleteClass */
    override var enabled: scala.Boolean = js.native
    /* CompleteClass */
    override var initialized: scala.Boolean = js.native
    /* CompleteClass */
    override var isPluginsReady: scala.Boolean = js.native
    /* CompleteClass */
    override var pluginName: java.lang.String = js.native
    /* CompleteClass */
    override var pluginsInitializedCallback: js.Array[_] = js.native
    /* CompleteClass */
    override def addHook(name: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /* CompleteClass */
    override def callOnPluginsReady(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /* CompleteClass */
    override def clearHooks(): scala.Unit = js.native
    /* CompleteClass */
    override def destroy(): scala.Unit = js.native
    /* CompleteClass */
    override def disablePlugin(): scala.Unit = js.native
    /* CompleteClass */
    override def enablePlugin(): scala.Unit = js.native
    /* CompleteClass */
    override def init(): scala.Unit = js.native
    /* CompleteClass */
    override def removeHook(name: java.lang.String): scala.Unit = js.native
  }
  
  // utils for Filters
  @JSName("FiltersPlugin")
  @js.native
  object FiltersPluginNs extends js.Object
  
}

