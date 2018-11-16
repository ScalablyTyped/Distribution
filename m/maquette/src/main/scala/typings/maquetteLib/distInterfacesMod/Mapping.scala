package typings
package maquetteLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Mapping[Source, Target] extends js.Object {
  /**
       * The array of results. These results will be synchronized with the latest array of sources that were provided using [[map]].
       */
  var results: js.Array[Target]
  /**
       * Maps a new array of sources and updates [[results]].
       *
       * @param newSources   The new array of sources.
       */
  def map(newSources: js.Array[Source]): scala.Unit
}

