package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var attachment: js.Any
  var color: js.Any
  var image: js.Any
  var position: js.Any | (js.Tuple2[
    js.UndefOr[
      csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
    ], 
    js.UndefOr[
      csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
    ]
  ])
   // Can be written using array e.g. `[0 0]`
  var repeat: js.Any
  var size: js.Any | (js.Tuple2[
    js.UndefOr[
      csstypeLib.csstypeMod.BackgroundSizeProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
    ], 
    js.UndefOr[
      csstypeLib.csstypeMod.BackgroundSizeProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
    ]
  ])
}

object Anon_0 {
  @scala.inline
  def apply(
    attachment: js.Any,
    color: js.Any,
    image: js.Any,
    position: js.Any | (js.Tuple2[
      js.UndefOr[
        csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
      ], 
      js.UndefOr[
        csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
      ]
    ]),
    repeat: js.Any,
    size: js.Any | (js.Tuple2[
      js.UndefOr[
        csstypeLib.csstypeMod.BackgroundSizeProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
      ], 
      js.UndefOr[
        csstypeLib.csstypeMod.BackgroundSizeProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
      ]
    ])
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(attachment = attachment, color = color, image = image, position = position.asInstanceOf[js.Any], repeat = repeat, size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_0]
  }
}

