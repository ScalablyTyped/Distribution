package typings.jsplumb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* -------------------------------------------- Group ---------------------------------------------------- */
@js.native
trait Group extends StObject {
  
  def add(el: ElementRef): Unit = js.native
  def add(el: ElementRef, doNotFireEvent: Boolean): Unit = js.native
  
  var collapsed: Boolean = js.native
  
  var connections: GroupConnections = js.native
  
  def getAnchor(): AnchorSpec = js.native
  
  def getDragArea(): ElementRef = js.native
  
  def getEl(): ElementRef = js.native
  
  def getEndpoint(): EndpointSpec = js.native
  
  def getMembers(): js.Array[ElementRef] = js.native
  
  var id: String = js.native
  
  def orphanAll(): OrphanedPositions = js.native
  
  def overrideDrop(): Boolean = js.native
  def overrideDrop(el: Unit, targetGroup: Group): Boolean = js.native
  def overrideDrop(el: ElementRef): Boolean = js.native
  def overrideDrop(el: ElementRef, targetGroup: Group): Boolean = js.native
  
  def remove(el: ElementRef): Unit = js.native
  def remove(el: ElementRef, manipulateDOM: Boolean): Unit = js.native
  def remove(el: ElementRef, manipulateDOM: Boolean, doNotFireEvent: Boolean): Unit = js.native
  def remove(el: ElementRef, manipulateDOM: Boolean, doNotFireEvent: Boolean, doNotUpdateConnections: Boolean): Unit = js.native
  def remove(
    el: ElementRef,
    manipulateDOM: Boolean,
    doNotFireEvent: Boolean,
    doNotUpdateConnections: Boolean,
    targetGroup: Group
  ): Unit = js.native
  def remove(
    el: ElementRef,
    manipulateDOM: Boolean,
    doNotFireEvent: Boolean,
    doNotUpdateConnections: Unit,
    targetGroup: Group
  ): Unit = js.native
  def remove(el: ElementRef, manipulateDOM: Boolean, doNotFireEvent: Unit, doNotUpdateConnections: Boolean): Unit = js.native
  def remove(
    el: ElementRef,
    manipulateDOM: Boolean,
    doNotFireEvent: Unit,
    doNotUpdateConnections: Boolean,
    targetGroup: Group
  ): Unit = js.native
  def remove(
    el: ElementRef,
    manipulateDOM: Boolean,
    doNotFireEvent: Unit,
    doNotUpdateConnections: Unit,
    targetGroup: Group
  ): Unit = js.native
  def remove(el: ElementRef, manipulateDOM: Unit, doNotFireEvent: Boolean): Unit = js.native
  def remove(el: ElementRef, manipulateDOM: Unit, doNotFireEvent: Boolean, doNotUpdateConnections: Boolean): Unit = js.native
  def remove(
    el: ElementRef,
    manipulateDOM: Unit,
    doNotFireEvent: Boolean,
    doNotUpdateConnections: Boolean,
    targetGroup: Group
  ): Unit = js.native
  def remove(
    el: ElementRef,
    manipulateDOM: Unit,
    doNotFireEvent: Boolean,
    doNotUpdateConnections: Unit,
    targetGroup: Group
  ): Unit = js.native
  def remove(el: ElementRef, manipulateDOM: Unit, doNotFireEvent: Unit, doNotUpdateConnections: Boolean): Unit = js.native
  def remove(
    el: ElementRef,
    manipulateDOM: Unit,
    doNotFireEvent: Unit,
    doNotUpdateConnections: Boolean,
    targetGroup: Group
  ): Unit = js.native
  def remove(
    el: ElementRef,
    manipulateDOM: Unit,
    doNotFireEvent: Unit,
    doNotUpdateConnections: Unit,
    targetGroup: Group
  ): Unit = js.native
  
  def removeAll(): Unit = js.native
  def removeAll(manipulateDOM: Boolean): Unit = js.native
  def removeAll(manipulateDOM: Boolean, doNotFireEvent: Boolean): Unit = js.native
  def removeAll(manipulateDOM: Unit, doNotFireEvent: Boolean): Unit = js.native
}
