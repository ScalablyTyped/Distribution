package typings.leafletEditable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handler for dragging path vertices.
  */
@js.native
trait VertexMarker
  extends StObject
     with Marker {
  
  /**
    * Continue the vertex LatLngs from this vertex.
    * Only active for first and last vertices of a Polyline.
    */
  def continue(): Unit = js.native
  
  /**
    * Delete a vertex and the related LatLng.
    */
  def delete(): Unit = js.native
  
  /**
    * Get the index of the current vertex among others of the same LatLngs group.
    */
  def getIndex(): Double = js.native
  
  /**
    * Get last vertex index of the LatLngs group of the current vertex.
    */
  def getLastIndex(): Double = js.native
  
  /**
    * Get the next VertexMarker in the same LatLngs group.
    */
  def getNext(): VertexMarker = js.native
  
  /**
    * Get the previous VertexMarker in the same LatLngs group.
    */
  def getPrevious(): VertexMarker = js.native
  
  /**
    * Split the vertex LatLngs group at its index, if possible.
    */
  def split(): Unit = js.native
}
