package typings.igniteUi.global.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Infragistics.Hierarchy")
@js.native
class Hierarchy ()
  extends StObject
     with typings.igniteUi.Infragistics.Hierarchy {
  
  /**
    * Returns the unique name of the 'All' member for the hierarchy.
    *
    * @param value
    */
  /* CompleteClass */
  override def allMember(value: js.Object): String = js.native
  
  /**
    * Returns the caption of the hierarchy used when displaying the name of the hierarchy to the user.
    *
    * @param value
    */
  /* CompleteClass */
  override def caption(value: js.Object): String = js.native
  
  /**
    * Returns the unique name of the default member for the hierarchy.
    *
    * @param value
    */
  /* CompleteClass */
  override def defaultMember(value: js.Object): String = js.native
  
  /**
    * Returns a user-friendly description of the hierarchy.
    *
    * @param value
    */
  /* CompleteClass */
  override def description(value: js.Object): String = js.native
  
  /**
    * Returns the unique name of the dimension that contains the hierarchy.
    *
    * @param value
    */
  /* CompleteClass */
  override def dimensionUniqueName(value: js.Object): String = js.native
  
  /**
    * Returns the hierarchy display folder path to be used when displaying the hierarchy in the user interface.
    *             Folder names will be separated by a semicolon (;). Nested folders are indicated by a backslash (\).
    *
    * @param value
    */
  /* CompleteClass */
  override def hierarchyDisplayFolder(value: js.Object): String = js.native
  
  /**
    * Returns the source of the hierarchy which is a value from the $.ig.HierarchyOrigin enumeration.
    *
    *             $.ig.HierarchyOrigin.prototype.userDefined = 1;
    *             Identifies user defined hierarchies.
    *
    *             $.ig.HierarchyOrigin.prototype.systemEnabled = 2;
    *             Identifies attribute hierarchies.
    *
    *             $.ig.HierarchyOrigin.prototype.systemInternal = 4;
    *             Identifies attributes with no attribute .
    *
    * @param value
    */
  /* CompleteClass */
  override def hierarchyOrigin(value: js.Object): Double = js.native
  
  /**
    * Returns the name of the hierarchy.
    *
    * @param value
    */
  /* CompleteClass */
  override def name(value: js.Object): String = js.native
  
  /**
    * Returns the unique name of the hierarchy.
    *
    * @param value
    */
  /* CompleteClass */
  override def uniqueName(value: js.Object): String = js.native
}
