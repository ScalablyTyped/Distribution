package typings.gorillaEngine.GorillaEngine

import typings.gorillaEngine.anon.Data0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Instrument
  */
@js.native
trait Instrument extends StObject {
  
  /**
    * Method used to retrieve an array of doubles from the Gorilla Engine.
    *
    * @param path The path to the array that should be retrieved.
    * @returns The array of doubles found at the given `path` or `false` if nothing was found.
    */
  def getDoubleArrayAtPath(path: String): js.typedarray.Float64Array | Boolean = js.native
  
  /**
    * Method used to retrieve a double from the Gorilla Engine.
    *
    * @param path The path to the double should be retrieved.
    * @returns The double found at the given `path` or `false` if nothing was found.
    */
  def getDoubleAtPath(path: String): Double | Boolean = js.native
  
  /**
    * Method used to retrieve an array of integers from the Gorilla Engine.
    *
    * @param path The path to the array that should be retrieved.
    * @returns The array of integers found at the given `path` or `false` if nothing was found.
    */
  def getIntArrayAtPath(path: String): js.typedarray.Int32Array | Boolean = js.native
  
  /**
    * Method used to retrieve an integer from the Gorilla Engine.
    *
    * @param path The path to the integer should be retrieved.
    * @returns The integer found at the given `path` or `false` if nothing was found.
    */
  def getIntAtPath(path: String): Double | Boolean = js.native
  
  /**
    * Method used to retrieve MIDI data from the first instrument script that implements `on midi_drag`
    *
    * @returns Array of Midi Events
    */
  def getMidiDragData(): js.Array[Data0] = js.native
  
  /**
    * Method used to retrieve a serialised module from the Gorilla Engine.
    *
    * @param path The path to the module that should be retrieved.
    * @returns The serialised module found at the given `path` or `false` if nothing was found.
    */
  def getModuleAtPath(path: String): String | Boolean = js.native
  
  /**
    * Method used to retrieve a normalised double from the Gorilla Engine.
    *
    * @param path The path to the normalised double should be retrieved.
    * @returns The normalised double found at the given `path` or `false` if nothing was found.
    */
  def getNormalisedDoubleAtPath(): Double | Boolean = js.native
  
  /**
    * Method used to retrieve a value from the Gorilla Engine.
    *
    * @param path The path to the value that should be retrieved.
    * @returns The value found at the given `path` or `false` if nothing was found.
    */
  def getValueAtPath(path: String): String | js.Object | Double | js.typedarray.Int32Array | js.typedarray.Float64Array | Boolean = js.native
  
  /**
    * Method used to render a section of a sample to a waveform. Commonly used to source the `value` property of the `waveform` control.
    *
    * @param numPoints The number of points that the waveform should be rendered into.
    * @param zoneId The id of the zone whichs sample should be rendered to a waveform.
    * @param start A normalised value indicating from where in the sample waveform rendering should start.
    * @param end A normalised value indicating  where in the sample waveform rendering should end.
    * @returns The waveform of the sample found at `zoneId`.
    */
  def getWaveformData(numPoints: Double, zoneId: Double, start: Double, end: Double): js.typedarray.Uint8Array = js.native
  
  /**
    * Method used to insert a Gorilla Engine module at a given path.
    * Attempting to set a variable-length module array entry greater than the current length of the array
    * will fail (for example, to set `Groups/2` the groups `0` and `1` must exist). Setting a module always inserts
    * the module at the speficied index while other value types overwrite the value at the index.
    * To replace a module at a `path` use {@link Instrument#removeModuleAtPath} prior to inserting the new module.
    *
    * @param path The path at which the module should be inserted.
    * @param value A Gorilla Enginge module serialised to JSON that should be set at the given `path`.
    * @returns `true` if the module has been inserted succcessfully or `false` otherwise.
    */
  def insertModuleAtPath(path: String, value: String): Boolean = js.native
  
  /**
    * Method used to determine if a value from the Gorilla Engine is a module.
    *
    * @param path The path to the value that should be determined.
    * @returns `true` if the value found at the given `path` is a module or `false` if it's not or nothing was found.
    */
  def isModuleAtPath(path: String): Boolean = js.native
  
  /**
    * Method used to send a `note off` MIDI event to the Gorilla Engine.
    *
    * @param key The musical key that should be untriggered. The key is expected to be between `0` and `127`.
    */
  def noteOff(ke: Double): Unit = js.native
  
  /**
    * Method used to send a `note on` MIDI event to the Gorilla Engine.
    *
    * @param key The musical key that should be triggered. The key is expected to be between `0` and `127`.
    * @param velocity The velocity that the key should be triggerd with. The velocity is expected to be between `0` and `127`.
    */
  def noteOn(key: Double, velocity: Double): Unit = js.native
  
  def on(propName: String, handler: js.Function1[/* normValue */ Double, Unit]): Unit = js.native
  
  /**
    * Method used to remove a module at a given `path`.
    *
    * @param path The path to the module that should be removed.
    * @returns `true` if the module has been removed succcessfully or `false` otherwise.
    */
  def removeModuleAtPath(path: String): Boolean = js.native
  
  /**
    * Method used to set an array of floats or doubles at a ceterain path in the Gorilla Engine.
    *
    * @param path The path to the double array that should be set.
    * @param value The float or double array that should be set at the given `path`.
    * @returns `true` if the value has been set succcessfully or `false` otherwise.
    */
  def setDoubleArrayAtPath(path: String, value: js.typedarray.Float32Array): Boolean = js.native
  def setDoubleArrayAtPath(path: String, value: js.typedarray.Float64Array): Boolean = js.native
  
  /**
    * Method used to set a double at a ceterain path in the Gorilla Engine.
    *
    * @param path The path to the double that should be set.
    * @param value The double that should be set at the given `path`.
    * @returns `true` if the value has been set succcessfully or `false` otherwise.
    */
  def setDoubleAtPath(path: String, value: Double): Boolean = js.native
  
  def setIntArrayAtPath(path: String, value: js.typedarray.Int16Array): Boolean = js.native
  def setIntArrayAtPath(path: String, value: js.typedarray.Int32Array): Boolean = js.native
  /**
    * Method used to set an array of integers at a ceterain path in the Gorilla Engine.
    *
    * @param path The path to the integer array that should be set.
    * @param value The integer array that should be set at the given `path`.
    * @returns `true` if the value has been set succcessfully or `false` otherwise.
    */
  def setIntArrayAtPath(path: String, value: js.typedarray.Int8Array): Boolean = js.native
  def setIntArrayAtPath(path: String, value: js.typedarray.Uint16Array): Boolean = js.native
  def setIntArrayAtPath(path: String, value: js.typedarray.Uint32Array): Boolean = js.native
  def setIntArrayAtPath(path: String, value: js.typedarray.Uint8Array): Boolean = js.native
  
  /**
    * Method used to set an integer at a ceterain path in the Gorilla Engine.
    *
    * @param path The path to the integer that should be set.
    * @param value The integer that should be set at the given `path`.
    * @returns `true` if the value has been set succcessfully or `false` otherwise.
    */
  def setIntAtPath(path: String, value: Double): Boolean = js.native
  
  /**
    * Method used to set a normalised double at a ceterain path in the Gorilla Engine.
    *
    * @param path The path to the normalised double that should be set.
    * @param value The normalised double that should be set at the given `path`.
    * @returns `true` if the value has been set succcessfully or `false` otherwise.
    */
  def setNormalisedDoubleAtPath(path: String, value: Double): Boolean = js.native
  
  /**
    * Method used to set a string at a certain path in the engine.
    * This method could for example be used to set a user sample to a certain Zone in the Gorilla Engine.
    *
    * @param path The path to the string that should be set.
    * @param value The string that should be set at the given `path`.
    * @returns `true` if the value has been set succcessfully or `false` otherwise.
    */
  def setStringAtPath(path: String, value: String): Boolean = js.native
  
  /**
    * Method used to stringify a given `value` at a certain `path` in the Gorilla Engine.
    * This is useful to get a label string for parameters in the Gorilla Engine.
    * The value is denormalised according to the scale of the parameter found at `path` and
    * the parameter’s unit is appended to the string accordingly.
    *
    * @param path The path at which the value should be stringified.
    * @param value A value that should be stringified at the given `path`.
    * @returns `false` if the value could not be stringified or the given `value` as a `string`.
    */
  def valueToStringAtPath(path: String, value: Double): Boolean | String = js.native
}
