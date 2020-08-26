package typings.heremaps.global.H.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This namespace contains basic UI elements from which the UI controls are built.
  */
@JSGlobal("H.ui.base")
@js.native
object base extends js.Object {
  @js.native
  /**
    * Constructor
    * @param opt_elementType {string=} - the type of HTML element this UI element renders as, default is 'div'
    * @param opt_className {string=} - an optional class name to be used on this element
    * @param opt_children {Array<H.ui.base.Element>=} - optional child elements to be added to this container
    */
  class Container ()
    extends typings.heremaps.H.ui.base.Container {
    def this(opt_elementType: String) = this()
    def this(opt_elementType: js.UndefOr[scala.Nothing], opt_className: String) = this()
    def this(opt_elementType: String, opt_className: String) = this()
    def this(
      opt_elementType: js.UndefOr[scala.Nothing],
      opt_className: js.UndefOr[scala.Nothing],
      opt_children: js.Array[typings.heremaps.H.ui.base.Element]
    ) = this()
    def this(
      opt_elementType: js.UndefOr[scala.Nothing],
      opt_className: String,
      opt_children: js.Array[typings.heremaps.H.ui.base.Element]
    ) = this()
    def this(
      opt_elementType: String,
      opt_className: js.UndefOr[scala.Nothing],
      opt_children: js.Array[typings.heremaps.H.ui.base.Element]
    ) = this()
    def this(
      opt_elementType: String,
      opt_className: String,
      opt_children: js.Array[typings.heremaps.H.ui.base.Element]
    ) = this()
  }
  
  @js.native
  /**
    * Constructor
    * @param opt_elementType {string=} - the type of HTML element this UI element renders as, default is 'div'
    * @param opt_className {string=} - an optional class name to be used on this element
    */
  class Element ()
    extends typings.heremaps.H.ui.base.Element {
    def this(opt_elementType: String) = this()
    def this(opt_elementType: js.UndefOr[scala.Nothing], opt_className: String) = this()
    def this(opt_elementType: String, opt_className: String) = this()
  }
  
}

