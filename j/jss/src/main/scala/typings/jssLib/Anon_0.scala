package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var attachment: scala.Nothing
  var color: scala.Nothing
  var image: scala.Nothing
  var position: scala.Nothing | (js.Tuple2[
    js.UndefOr[
      csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
    ], 
    js.UndefOr[
      csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
    ]
  ])
   // Can be written using array e.g. `[0 0]`
  var repeat: scala.Nothing
  var size: scala.Nothing | (js.Tuple2[
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
    attachment: scala.Nothing,
    color: scala.Nothing,
    image: scala.Nothing,
    position: scala.Nothing | (js.Tuple2[
      js.UndefOr[
        csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
      ], 
      js.UndefOr[
        csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
      ]
    ]),
    repeat: scala.Nothing,
    size: scala.Nothing | (js.Tuple2[
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

