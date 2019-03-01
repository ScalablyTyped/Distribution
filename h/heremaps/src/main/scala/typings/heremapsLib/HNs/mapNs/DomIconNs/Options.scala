package typings
package heremapsLib.HNs.mapNs.DomIconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used to initialize a DomIcon
  * @property onAttach {function(Element, H.map.DomIcon, H.map.DomMarker)=} - A callback which is invoked before a clone of the icon's element is appended and displayed on the map.
  * This callback can be used to setup the clone.
  * @property onDetach {function(Element, H.map.DomIcon, H.map.DomMarker)=} - A callback which is invoked after a clone of the icon's element is removed from the map.
  * This callback can be used to clean up the clone.
  */
trait Options extends js.Object {
  var onAttach: js.UndefOr[
    js.Function3[
      /* el */ stdLib.Element, 
      /* icon */ heremapsLib.HNs.mapNs.DomIcon, 
      /* marker */ heremapsLib.HNs.mapNs.DomMarker, 
      scala.Unit
    ]
  ] = js.undefined
  var onDetach: js.UndefOr[
    js.Function3[
      /* el */ stdLib.Element, 
      /* icon */ heremapsLib.HNs.mapNs.DomIcon, 
      /* marker */ heremapsLib.HNs.mapNs.DomMarker, 
      scala.Unit
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    onAttach: js.Function3[
      /* el */ stdLib.Element, 
      /* icon */ heremapsLib.HNs.mapNs.DomIcon, 
      /* marker */ heremapsLib.HNs.mapNs.DomMarker, 
      scala.Unit
    ] = null,
    onDetach: js.Function3[
      /* el */ stdLib.Element, 
      /* icon */ heremapsLib.HNs.mapNs.DomIcon, 
      /* marker */ heremapsLib.HNs.mapNs.DomMarker, 
      scala.Unit
    ] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (onAttach != null) __obj.updateDynamic("onAttach")(onAttach)
    if (onDetach != null) __obj.updateDynamic("onDetach")(onDetach)
    __obj.asInstanceOf[Options]
  }
}

