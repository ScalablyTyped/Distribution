package typings.jsmidgen

import typings.jsmidgen.anon.Channel
import typings.jsmidgen.anon.Data
import typings.jsmidgen.anon.Events
import typings.jsmidgen.anon.Ticks
import typings.jsmidgen.jsmidgenInts.`0`
import typings.jsmidgen.jsmidgenInts.`0x00`
import typings.jsmidgen.jsmidgenInts.`0x01`
import typings.jsmidgen.jsmidgenInts.`0x02`
import typings.jsmidgen.jsmidgenInts.`0x03`
import typings.jsmidgen.jsmidgenInts.`0x04`
import typings.jsmidgen.jsmidgenInts.`0x05`
import typings.jsmidgen.jsmidgenInts.`0x06`
import typings.jsmidgen.jsmidgenInts.`0x07`
import typings.jsmidgen.jsmidgenInts.`0x20`
import typings.jsmidgen.jsmidgenInts.`0x2f`
import typings.jsmidgen.jsmidgenInts.`0x4d`
import typings.jsmidgen.jsmidgenInts.`0x51`
import typings.jsmidgen.jsmidgenInts.`0x54`
import typings.jsmidgen.jsmidgenInts.`0x58`
import typings.jsmidgen.jsmidgenInts.`0x59`
import typings.jsmidgen.jsmidgenInts.`0x6b`
import typings.jsmidgen.jsmidgenInts.`0x72`
import typings.jsmidgen.jsmidgenInts.`0x7f`
import typings.jsmidgen.jsmidgenInts.`0x80`
import typings.jsmidgen.jsmidgenInts.`0x90`
import typings.jsmidgen.jsmidgenInts.`0xa0`
import typings.jsmidgen.jsmidgenInts.`0xb0`
import typings.jsmidgen.jsmidgenInts.`0xc0`
import typings.jsmidgen.jsmidgenInts.`0xd0`
import typings.jsmidgen.jsmidgenInts.`0xe0`
import typings.jsmidgen.jsmidgenInts.`0xff`
import typings.jsmidgen.jsmidgenInts.`128`
import typings.jsmidgen.jsmidgenInts.`12`
import typings.jsmidgen.jsmidgenInts.`14`
import typings.jsmidgen.jsmidgenInts.`16`
import typings.jsmidgen.jsmidgenInts.`17`
import typings.jsmidgen.jsmidgenInts.`19`
import typings.jsmidgen.jsmidgenInts.`21`
import typings.jsmidgen.jsmidgenInts.`23`
import typings.jsmidgen.jsmidgenInts.`256`
import typings.jsmidgen.jsmidgenInts.`90`
import typings.jsmidgen.jsmidgenStrings.MThd
import typings.jsmidgen.jsmidgenStrings.NullNull
import typings.jsmidgen.jsmidgenStrings.NullNullNullAcknowledge
import typings.jsmidgen.jsmidgenStrings.NullStartofheading
import typings.jsmidgen.jsmidgenStrings.a
import typings.jsmidgen.jsmidgenStrings.aNumbersign
import typings.jsmidgen.jsmidgenStrings.ab
import typings.jsmidgen.jsmidgenStrings.b
import typings.jsmidgen.jsmidgenStrings.bb
import typings.jsmidgen.jsmidgenStrings.c
import typings.jsmidgen.jsmidgenStrings.cNumbersign
import typings.jsmidgen.jsmidgenStrings.d
import typings.jsmidgen.jsmidgenStrings.dNumbersign
import typings.jsmidgen.jsmidgenStrings.db
import typings.jsmidgen.jsmidgenStrings.e
import typings.jsmidgen.jsmidgenStrings.eb
import typings.jsmidgen.jsmidgenStrings.f
import typings.jsmidgen.jsmidgenStrings.fNumbersign
import typings.jsmidgen.jsmidgenStrings.g
import typings.jsmidgen.jsmidgenStrings.gNumbersign
import typings.jsmidgen.jsmidgenStrings.gb
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsmidgen", "DEFAULT_CHANNEL")
  @js.native
  val DEFAULT_CHANNEL: `0` = js.native
  
  @JSImport("jsmidgen", "DEFAULT_DURATION")
  @js.native
  val DEFAULT_DURATION: `128` = js.native
  
  @JSImport("jsmidgen", "DEFAULT_VOLUME")
  @js.native
  val DEFAULT_VOLUME: `90` = js.native
  
  @JSImport("jsmidgen", "Event")
  @js.native
  open class Event () extends StObject {
    def this(params: Channel) = this()
    
    def setChannel(channel: MidiChannel): Unit = js.native
    
    def setParam1(p: MidiParameterValue): Unit = js.native
    
    def setParam2(p: MidiParameterValue): Unit = js.native
    
    def setTime(ticks: Double): Unit = js.native
    
    def setType(`type`: MidiEventType): Unit = js.native
    
    def toBytes(): js.Array[Double] = js.native
  }
  object Event {
    
    @JSImport("jsmidgen", "Event.AFTER_TOUCH")
    @js.native
    val AFTER_TOUCH: `0xa0` = js.native
    
    @JSImport("jsmidgen", "Event.CHANNEL_AFTERTOUCH")
    @js.native
    val CHANNEL_AFTERTOUCH: `0xd0` = js.native
    
    @JSImport("jsmidgen", "Event.CONTROLLER")
    @js.native
    val CONTROLLER: `0xb0` = js.native
    
    @JSImport("jsmidgen", "Event.NOTE_OFF")
    @js.native
    val NOTE_OFF: `0x80` = js.native
    
    @JSImport("jsmidgen", "Event.NOTE_ON")
    @js.native
    val NOTE_ON: `0x90` = js.native
    
    @JSImport("jsmidgen", "Event.PITCH_BEND")
    @js.native
    val PITCH_BEND: `0xe0` = js.native
    
    @JSImport("jsmidgen", "Event.PROGRAM_CHANGE")
    @js.native
    val PROGRAM_CHANGE: `0xc0` = js.native
  }
  
  @JSImport("jsmidgen", "File")
  @js.native
  open class File () extends StObject {
    def this(config: Ticks) = this()
    
    def addTrack(track: Unit): Track = js.native
    def addTrack(track: Track): this.type = js.native
    
    var ticks: Double = js.native
    
    def toBytes(): js.Array[Double] = js.native
    
    var tracks: js.Array[Track] = js.native
  }
  /* static members */
  object File {
    
    @JSImport("jsmidgen", "File")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jsmidgen", "File.HDR_CHUNKID")
    @js.native
    def HDR_CHUNKID: MThd = js.native
    inline def HDR_CHUNKID_=(x: MThd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HDR_CHUNKID")(x.asInstanceOf[js.Any])
    
    @JSImport("jsmidgen", "File.HDR_CHUNK_SIZE")
    @js.native
    def HDR_CHUNK_SIZE: NullNullNullAcknowledge = js.native
    inline def HDR_CHUNK_SIZE_=(x: NullNullNullAcknowledge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HDR_CHUNK_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("jsmidgen", "File.HDR_TYPE0")
    @js.native
    def HDR_TYPE0: NullNull = js.native
    inline def HDR_TYPE0_=(x: NullNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HDR_TYPE0")(x.asInstanceOf[js.Any])
    
    @JSImport("jsmidgen", "File.HDR_TYPE1")
    @js.native
    def HDR_TYPE1: NullStartofheading = js.native
    inline def HDR_TYPE1_=(x: NullStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HDR_TYPE1")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("jsmidgen", "MetaEvent")
  @js.native
  open class MetaEvent () extends StObject {
    def this(params: Data) = this()
    
    def setData(d: String): Unit = js.native
    def setData(d: js.Array[Double]): Unit = js.native
    
    def setTime(ticks: Double): Unit = js.native
    
    def setType(t: MetaEventType): Unit = js.native
    
    def toBytes(): js.Array[Double] = js.native
  }
  object MetaEvent {
    
    @JSImport("jsmidgen", "MetaEvent.CHANNEL_PREFIX")
    @js.native
    val CHANNEL_PREFIX: `0x20` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.COPYRIGHT")
    @js.native
    val COPYRIGHT: `0x02` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.CUE_POINT")
    @js.native
    val CUE_POINT: `0x07` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.END_OF_TRACK")
    @js.native
    val END_OF_TRACK: `0x2f` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.INSTRUMENT")
    @js.native
    val INSTRUMENT: `0x04` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.KEY_SIG")
    @js.native
    val KEY_SIG: `0x59` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.LYRIC")
    @js.native
    val LYRIC: `0x05` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.MARKER")
    @js.native
    val MARKER: `0x06` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.SEQUENCE")
    @js.native
    val SEQUENCE: `0x00` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.SEQ_EVENT")
    @js.native
    val SEQ_EVENT: `0x7f` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.SMPTE")
    @js.native
    val SMPTE: `0x54` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.TEMPO")
    @js.native
    val TEMPO: `0x51` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.TEXT")
    @js.native
    val TEXT: `0x01` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.TIME_SIG")
    @js.native
    val TIME_SIG: `0x58` = js.native
    
    @JSImport("jsmidgen", "MetaEvent.TRACK_NAME")
    @js.native
    val TRACK_NAME: `0x03` = js.native
  }
  
  @JSImport("jsmidgen", "Track")
  @js.native
  open class Track () extends StObject {
    def this(config: Events) = this()
    
    def addChord(channel: MidiChannel, chord: js.Array[Double | String], dur: Double, velocity: Double): this.type = js.native
    
    def addEvent(event: Event): this.type = js.native
    def addEvent(event: MetaEvent): this.type = js.native
    
    def addNote(channel: MidiChannel, pitch: String, dur: Double): this.type = js.native
    def addNote(channel: MidiChannel, pitch: String, dur: Double, time: Double): this.type = js.native
    def addNote(channel: MidiChannel, pitch: String, dur: Double, time: Double, velocity: Double): this.type = js.native
    def addNote(channel: MidiChannel, pitch: String, dur: Double, time: Unit, velocity: Double): this.type = js.native
    def addNote(channel: MidiChannel, pitch: Double, dur: Double): this.type = js.native
    def addNote(channel: MidiChannel, pitch: Double, dur: Double, time: Double): this.type = js.native
    def addNote(channel: MidiChannel, pitch: Double, dur: Double, time: Double, velocity: Double): this.type = js.native
    def addNote(channel: MidiChannel, pitch: Double, dur: Double, time: Unit, velocity: Double): this.type = js.native
    
    def addNoteOff(channel: MidiChannel, pitch: String): this.type = js.native
    def addNoteOff(channel: MidiChannel, pitch: String, time: Double): this.type = js.native
    def addNoteOff(channel: MidiChannel, pitch: String, time: Double, velocity: Double): this.type = js.native
    def addNoteOff(channel: MidiChannel, pitch: String, time: Unit, velocity: Double): this.type = js.native
    def addNoteOff(channel: MidiChannel, pitch: Double): this.type = js.native
    def addNoteOff(channel: MidiChannel, pitch: Double, time: Double): this.type = js.native
    def addNoteOff(channel: MidiChannel, pitch: Double, time: Double, velocity: Double): this.type = js.native
    def addNoteOff(channel: MidiChannel, pitch: Double, time: Unit, velocity: Double): this.type = js.native
    
    def addNoteOn(channel: MidiChannel, pitch: String): this.type = js.native
    def addNoteOn(channel: MidiChannel, pitch: String, time: Double): this.type = js.native
    def addNoteOn(channel: MidiChannel, pitch: String, time: Double, velocity: Double): this.type = js.native
    def addNoteOn(channel: MidiChannel, pitch: String, time: Unit, velocity: Double): this.type = js.native
    def addNoteOn(channel: MidiChannel, pitch: Double): this.type = js.native
    def addNoteOn(channel: MidiChannel, pitch: Double, time: Double): this.type = js.native
    def addNoteOn(channel: MidiChannel, pitch: Double, time: Double, velocity: Double): this.type = js.native
    def addNoteOn(channel: MidiChannel, pitch: Double, time: Unit, velocity: Double): this.type = js.native
    
    def chord(channel: MidiChannel, chord: js.Array[Double | String], dur: Double, velocity: Double): this.type = js.native
    
    def instrument(channel: MidiChannel, instrument: MidiParameterValue): this.type = js.native
    def instrument(channel: MidiChannel, instrument: MidiParameterValue, time: Double): this.type = js.native
    
    def note(channel: MidiChannel, pitch: String, dur: Double): this.type = js.native
    def note(channel: MidiChannel, pitch: String, dur: Double, time: Double): this.type = js.native
    def note(channel: MidiChannel, pitch: String, dur: Double, time: Double, velocity: Double): this.type = js.native
    def note(channel: MidiChannel, pitch: String, dur: Double, time: Unit, velocity: Double): this.type = js.native
    def note(channel: MidiChannel, pitch: Double, dur: Double): this.type = js.native
    def note(channel: MidiChannel, pitch: Double, dur: Double, time: Double): this.type = js.native
    def note(channel: MidiChannel, pitch: Double, dur: Double, time: Double, velocity: Double): this.type = js.native
    def note(channel: MidiChannel, pitch: Double, dur: Double, time: Unit, velocity: Double): this.type = js.native
    
    def noteOff(channel: MidiChannel, pitch: String): this.type = js.native
    def noteOff(channel: MidiChannel, pitch: String, time: Double): this.type = js.native
    def noteOff(channel: MidiChannel, pitch: String, time: Double, velocity: Double): this.type = js.native
    def noteOff(channel: MidiChannel, pitch: String, time: Unit, velocity: Double): this.type = js.native
    def noteOff(channel: MidiChannel, pitch: Double): this.type = js.native
    def noteOff(channel: MidiChannel, pitch: Double, time: Double): this.type = js.native
    def noteOff(channel: MidiChannel, pitch: Double, time: Double, velocity: Double): this.type = js.native
    def noteOff(channel: MidiChannel, pitch: Double, time: Unit, velocity: Double): this.type = js.native
    
    def noteOn(channel: MidiChannel, pitch: String): this.type = js.native
    def noteOn(channel: MidiChannel, pitch: String, time: Double): this.type = js.native
    def noteOn(channel: MidiChannel, pitch: String, time: Double, velocity: Double): this.type = js.native
    def noteOn(channel: MidiChannel, pitch: String, time: Unit, velocity: Double): this.type = js.native
    def noteOn(channel: MidiChannel, pitch: Double): this.type = js.native
    def noteOn(channel: MidiChannel, pitch: Double, time: Double): this.type = js.native
    def noteOn(channel: MidiChannel, pitch: Double, time: Double, velocity: Double): this.type = js.native
    def noteOn(channel: MidiChannel, pitch: Double, time: Unit, velocity: Double): this.type = js.native
    
    def setInstrument(channel: MidiChannel, instrument: MidiParameterValue): this.type = js.native
    def setInstrument(channel: MidiChannel, instrument: MidiParameterValue, time: Double): this.type = js.native
    
    def setTempo(bpm: Double): this.type = js.native
    def setTempo(bpm: Double, time: Double): this.type = js.native
    
    def tempo(bpm: Double): this.type = js.native
    def tempo(bpm: Double, time: Double): this.type = js.native
    
    def toBytes(): js.Array[Double] = js.native
  }
  /* static members */
  object Track {
    
    @JSImport("jsmidgen", "Track")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jsmidgen", "Track.END_BYTES")
    @js.native
    def END_BYTES: js.Tuple4[`0x00`, `0xff`, `0x2f`, `0x00`] = js.native
    inline def END_BYTES_=(x: js.Tuple4[`0x00`, `0xff`, `0x2f`, `0x00`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_BYTES")(x.asInstanceOf[js.Any])
    
    @JSImport("jsmidgen", "Track.START_BYTES")
    @js.native
    def START_BYTES: js.Tuple4[`0x4d`, `0x54`, `0x72`, `0x6b`] = js.native
    inline def START_BYTES_=(x: js.Tuple4[`0x4d`, `0x54`, `0x72`, `0x6b`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("START_BYTES")(x.asInstanceOf[js.Any])
  }
  
  object Util {
    
    @JSImport("jsmidgen", "Util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bpmFromMpqn(mpqn: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bpmFromMpqn")(mpqn.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def codes2Str(byteArray: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("codes2Str")(byteArray.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ensureMidiPitch(p: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureMidiPitch")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def ensureMidiPitch(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureMidiPitch")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    object midiFlattenedNotes {
      
      @JSImport("jsmidgen", "Util.midi_flattened_notes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("jsmidgen", "Util.midi_flattened_notes.a#")
      @js.native
      def a: bb = js.native
      
      inline def a_=(x: bb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a#")(x.asInstanceOf[js.Any])
      
      @JSImport("jsmidgen", "Util.midi_flattened_notes.c#")
      @js.native
      def c: db = js.native
      
      inline def c_=(x: db): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("c#")(x.asInstanceOf[js.Any])
      
      @JSImport("jsmidgen", "Util.midi_flattened_notes.d#")
      @js.native
      def d: eb = js.native
      
      inline def d_=(x: eb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("d#")(x.asInstanceOf[js.Any])
      
      @JSImport("jsmidgen", "Util.midi_flattened_notes.f#")
      @js.native
      def f: gb = js.native
      
      inline def f_=(x: gb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f#")(x.asInstanceOf[js.Any])
      
      @JSImport("jsmidgen", "Util.midi_flattened_notes.g#")
      @js.native
      def g: ab = js.native
      
      inline def g_=(x: ab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("g#")(x.asInstanceOf[js.Any])
    }
    
    object midiLetterPitches {
      
      @JSImport("jsmidgen", "Util.midi_letter_pitches")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("jsmidgen", "Util.midi_letter_pitches.a")
      @js.native
      def a: `21` = js.native
      inline def a_=(x: `21`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a")(x.asInstanceOf[js.Any])
      
      @JSImport("jsmidgen", "Util.midi_letter_pitches.b")
      @js.native
      def b: `23` = js.native
      inline def b_=(x: `23`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b")(x.asInstanceOf[js.Any])
      
      @JSImport("jsmidgen", "Util.midi_letter_pitches.c")
      @js.native
      def c: `12` = js.native
      inline def c_=(x: `12`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("c")(x.asInstanceOf[js.Any])
      
      @JSImport("jsmidgen", "Util.midi_letter_pitches.d")
      @js.native
      def d: `14` = js.native
      inline def d_=(x: `14`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("d")(x.asInstanceOf[js.Any])
      
      @JSImport("jsmidgen", "Util.midi_letter_pitches.e")
      @js.native
      def e: `16` = js.native
      inline def e_=(x: `16`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e")(x.asInstanceOf[js.Any])
      
      @JSImport("jsmidgen", "Util.midi_letter_pitches.f")
      @js.native
      def f: `17` = js.native
      inline def f_=(x: `17`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f")(x.asInstanceOf[js.Any])
      
      @JSImport("jsmidgen", "Util.midi_letter_pitches.g")
      @js.native
      def g: `19` = js.native
      inline def g_=(x: `19`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("g")(x.asInstanceOf[js.Any])
    }
    
    inline def midiPitchFromNote(n: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("midiPitchFromNote")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    object midiPitchesLetter {
      
      @JSImport("jsmidgen", "Util.midi_pitches_letter.12")
      @js.native
      val `12`: c = js.native
      
      @JSImport("jsmidgen", "Util.midi_pitches_letter.13")
      @js.native
      val `13`: cNumbersign = js.native
      
      @JSImport("jsmidgen", "Util.midi_pitches_letter.14")
      @js.native
      val `14`: d = js.native
      
      @JSImport("jsmidgen", "Util.midi_pitches_letter.15")
      @js.native
      val `15`: dNumbersign = js.native
      
      @JSImport("jsmidgen", "Util.midi_pitches_letter.16")
      @js.native
      val `16`: e = js.native
      
      @JSImport("jsmidgen", "Util.midi_pitches_letter.17")
      @js.native
      val `17`: f = js.native
      
      @JSImport("jsmidgen", "Util.midi_pitches_letter.18")
      @js.native
      val `18`: fNumbersign = js.native
      
      @JSImport("jsmidgen", "Util.midi_pitches_letter.19")
      @js.native
      val `19`: g = js.native
      
      @JSImport("jsmidgen", "Util.midi_pitches_letter.20")
      @js.native
      val `20`: gNumbersign = js.native
      
      @JSImport("jsmidgen", "Util.midi_pitches_letter.21")
      @js.native
      val `21`: a = js.native
      
      @JSImport("jsmidgen", "Util.midi_pitches_letter.22")
      @js.native
      val `22`: aNumbersign = js.native
      
      @JSImport("jsmidgen", "Util.midi_pitches_letter.23")
      @js.native
      val `23`: b = js.native
    }
    
    inline def mpqnFromBpm(bpm: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mpqnFromBpm")(bpm.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def noteFromMidiPitch(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("noteFromMidiPitch")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def noteFromMidiPitch(n: Double, returnFlattened: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("noteFromMidiPitch")(n.asInstanceOf[js.Any], returnFlattened.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def str2Bytes(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("str2Bytes")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def str2Bytes(str: String, finalBytes: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("str2Bytes")(str.asInstanceOf[js.Any], finalBytes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def translateTickTime(ticks: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("translateTickTime")(ticks.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Acc['length'] extends N ? Acc[number] : jsmidgen.jsmidgen.Enumerate<N, [...Acc, Acc['length']]>
    }}}
    */
  @js.native
  trait Enumerate[N /* <: Double */, Acc /* <: js.Array[Double] */] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsmidgen.jsmidgenInts.`0x00`
    - typings.jsmidgen.jsmidgenInts.`0x01`
    - typings.jsmidgen.jsmidgenInts.`0x02`
    - typings.jsmidgen.jsmidgenInts.`0x03`
    - typings.jsmidgen.jsmidgenInts.`0x04`
    - typings.jsmidgen.jsmidgenInts.`0x05`
    - typings.jsmidgen.jsmidgenInts.`0x06`
    - typings.jsmidgen.jsmidgenInts.`0x07`
    - typings.jsmidgen.jsmidgenInts.`0x20`
    - typings.jsmidgen.jsmidgenInts.`0x2f`
    - typings.jsmidgen.jsmidgenInts.`0x51`
    - typings.jsmidgen.jsmidgenInts.`0x54`
    - typings.jsmidgen.jsmidgenInts.`0x58`
    - typings.jsmidgen.jsmidgenInts.`0x59`
    - typings.jsmidgen.jsmidgenInts.`0x7f`
  */
  trait MetaEventType extends StObject
  object MetaEventType {
    
    inline def `0x00`: typings.jsmidgen.jsmidgenInts.`0x00` = 0x00.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x00`]
    
    inline def `0x01`: typings.jsmidgen.jsmidgenInts.`0x01` = 0x01.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x01`]
    
    inline def `0x02`: typings.jsmidgen.jsmidgenInts.`0x02` = 0x02.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x02`]
    
    inline def `0x03`: typings.jsmidgen.jsmidgenInts.`0x03` = 0x03.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x03`]
    
    inline def `0x04`: typings.jsmidgen.jsmidgenInts.`0x04` = 0x04.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x04`]
    
    inline def `0x05`: typings.jsmidgen.jsmidgenInts.`0x05` = 0x05.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x05`]
    
    inline def `0x06`: typings.jsmidgen.jsmidgenInts.`0x06` = 0x06.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x06`]
    
    inline def `0x07`: typings.jsmidgen.jsmidgenInts.`0x07` = 0x07.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x07`]
    
    inline def `0x20`: typings.jsmidgen.jsmidgenInts.`0x20` = 0x20.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x20`]
    
    inline def `0x2f`: typings.jsmidgen.jsmidgenInts.`0x2f` = 0x2f.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x2f`]
    
    inline def `0x51`: typings.jsmidgen.jsmidgenInts.`0x51` = 0x51.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x51`]
    
    inline def `0x54`: typings.jsmidgen.jsmidgenInts.`0x54` = 0x54.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x54`]
    
    inline def `0x58`: typings.jsmidgen.jsmidgenInts.`0x58` = 0x58.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x58`]
    
    inline def `0x59`: typings.jsmidgen.jsmidgenInts.`0x59` = 0x59.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x59`]
    
    inline def `0x7f`: typings.jsmidgen.jsmidgenInts.`0x7f` = 0x7f.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x7f`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsmidgen.jsmidgenInts.`0`
    - typings.jsmidgen.jsmidgenInts.`1`
    - typings.jsmidgen.jsmidgenInts.`2`
    - typings.jsmidgen.jsmidgenInts.`3`
    - typings.jsmidgen.jsmidgenInts.`4`
    - typings.jsmidgen.jsmidgenInts.`5`
    - typings.jsmidgen.jsmidgenInts.`6`
    - typings.jsmidgen.jsmidgenInts.`7`
    - typings.jsmidgen.jsmidgenInts.`8`
    - typings.jsmidgen.jsmidgenInts.`9`
    - typings.jsmidgen.jsmidgenInts.`10`
    - typings.jsmidgen.jsmidgenInts.`11`
    - typings.jsmidgen.jsmidgenInts.`12`
    - typings.jsmidgen.jsmidgenInts.`13`
    - typings.jsmidgen.jsmidgenInts.`14`
    - typings.jsmidgen.jsmidgenInts.`15`
  */
  trait MidiChannel extends StObject
  object MidiChannel {
    
    inline def `0`: typings.jsmidgen.jsmidgenInts.`0` = 0.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0`]
    
    inline def `1`: typings.jsmidgen.jsmidgenInts.`1` = 1.asInstanceOf[typings.jsmidgen.jsmidgenInts.`1`]
    
    inline def `10`: typings.jsmidgen.jsmidgenInts.`10` = 10.asInstanceOf[typings.jsmidgen.jsmidgenInts.`10`]
    
    inline def `11`: typings.jsmidgen.jsmidgenInts.`11` = 11.asInstanceOf[typings.jsmidgen.jsmidgenInts.`11`]
    
    inline def `12`: typings.jsmidgen.jsmidgenInts.`12` = 12.asInstanceOf[typings.jsmidgen.jsmidgenInts.`12`]
    
    inline def `13`: typings.jsmidgen.jsmidgenInts.`13` = 13.asInstanceOf[typings.jsmidgen.jsmidgenInts.`13`]
    
    inline def `14`: typings.jsmidgen.jsmidgenInts.`14` = 14.asInstanceOf[typings.jsmidgen.jsmidgenInts.`14`]
    
    inline def `15`: typings.jsmidgen.jsmidgenInts.`15` = 15.asInstanceOf[typings.jsmidgen.jsmidgenInts.`15`]
    
    inline def `2`: typings.jsmidgen.jsmidgenInts.`2` = 2.asInstanceOf[typings.jsmidgen.jsmidgenInts.`2`]
    
    inline def `3`: typings.jsmidgen.jsmidgenInts.`3` = 3.asInstanceOf[typings.jsmidgen.jsmidgenInts.`3`]
    
    inline def `4`: typings.jsmidgen.jsmidgenInts.`4` = 4.asInstanceOf[typings.jsmidgen.jsmidgenInts.`4`]
    
    inline def `5`: typings.jsmidgen.jsmidgenInts.`5` = 5.asInstanceOf[typings.jsmidgen.jsmidgenInts.`5`]
    
    inline def `6`: typings.jsmidgen.jsmidgenInts.`6` = 6.asInstanceOf[typings.jsmidgen.jsmidgenInts.`6`]
    
    inline def `7`: typings.jsmidgen.jsmidgenInts.`7` = 7.asInstanceOf[typings.jsmidgen.jsmidgenInts.`7`]
    
    inline def `8`: typings.jsmidgen.jsmidgenInts.`8` = 8.asInstanceOf[typings.jsmidgen.jsmidgenInts.`8`]
    
    inline def `9`: typings.jsmidgen.jsmidgenInts.`9` = 9.asInstanceOf[typings.jsmidgen.jsmidgenInts.`9`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsmidgen.jsmidgenInts.`0xa0`
    - typings.jsmidgen.jsmidgenInts.`0xd0`
    - typings.jsmidgen.jsmidgenInts.`0xb0`
    - typings.jsmidgen.jsmidgenInts.`0x80`
    - typings.jsmidgen.jsmidgenInts.`0x90`
    - typings.jsmidgen.jsmidgenInts.`0xe0`
    - typings.jsmidgen.jsmidgenInts.`0xc0`
  */
  trait MidiEventType extends StObject
  object MidiEventType {
    
    inline def `0x80`: typings.jsmidgen.jsmidgenInts.`0x80` = 0x80.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x80`]
    
    inline def `0x90`: typings.jsmidgen.jsmidgenInts.`0x90` = 0x90.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0x90`]
    
    inline def `0xa0`: typings.jsmidgen.jsmidgenInts.`0xa0` = 0xa0.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0xa0`]
    
    inline def `0xb0`: typings.jsmidgen.jsmidgenInts.`0xb0` = 0xb0.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0xb0`]
    
    inline def `0xc0`: typings.jsmidgen.jsmidgenInts.`0xc0` = 0xc0.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0xc0`]
    
    inline def `0xd0`: typings.jsmidgen.jsmidgenInts.`0xd0` = 0xd0.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0xd0`]
    
    inline def `0xe0`: typings.jsmidgen.jsmidgenInts.`0xe0` = 0xe0.asInstanceOf[typings.jsmidgen.jsmidgenInts.`0xe0`]
  }
  
  type MidiParameterValue = Range[`0`, `256`]
  
  type Range[F /* <: Double */, T /* <: Double */] = Exclude[Enumerate[T, js.Array[Any]], Enumerate[F, js.Array[Any]]]
}
