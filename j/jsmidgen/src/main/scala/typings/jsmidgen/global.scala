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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Midi {
    
    @JSGlobal("Midi.DEFAULT_CHANNEL")
    @js.native
    val DEFAULT_CHANNEL: `0` = js.native
    
    @JSGlobal("Midi.DEFAULT_DURATION")
    @js.native
    val DEFAULT_DURATION: `128` = js.native
    
    @JSGlobal("Midi.DEFAULT_VOLUME")
    @js.native
    val DEFAULT_VOLUME: `90` = js.native
    
    @JSGlobal("Midi.Event")
    @js.native
    open class Event ()
      extends typings.jsmidgen.mod.Event {
      def this(params: Channel) = this()
    }
    object Event {
      
      @JSGlobal("Midi.Event.AFTER_TOUCH")
      @js.native
      val AFTER_TOUCH: `0xa0` = js.native
      
      @JSGlobal("Midi.Event.CHANNEL_AFTERTOUCH")
      @js.native
      val CHANNEL_AFTERTOUCH: `0xd0` = js.native
      
      @JSGlobal("Midi.Event.CONTROLLER")
      @js.native
      val CONTROLLER: `0xb0` = js.native
      
      @JSGlobal("Midi.Event.NOTE_OFF")
      @js.native
      val NOTE_OFF: `0x80` = js.native
      
      @JSGlobal("Midi.Event.NOTE_ON")
      @js.native
      val NOTE_ON: `0x90` = js.native
      
      @JSGlobal("Midi.Event.PITCH_BEND")
      @js.native
      val PITCH_BEND: `0xe0` = js.native
      
      @JSGlobal("Midi.Event.PROGRAM_CHANGE")
      @js.native
      val PROGRAM_CHANGE: `0xc0` = js.native
    }
    
    @JSGlobal("Midi.File")
    @js.native
    open class File ()
      extends typings.jsmidgen.mod.File {
      def this(config: Ticks) = this()
    }
    /* static members */
    object File {
      
      @JSGlobal("Midi.File")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Midi.File.HDR_CHUNKID")
      @js.native
      def HDR_CHUNKID: MThd = js.native
      inline def HDR_CHUNKID_=(x: MThd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HDR_CHUNKID")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Midi.File.HDR_CHUNK_SIZE")
      @js.native
      def HDR_CHUNK_SIZE: NullNullNullAcknowledge = js.native
      inline def HDR_CHUNK_SIZE_=(x: NullNullNullAcknowledge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HDR_CHUNK_SIZE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Midi.File.HDR_TYPE0")
      @js.native
      def HDR_TYPE0: NullNull = js.native
      inline def HDR_TYPE0_=(x: NullNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HDR_TYPE0")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Midi.File.HDR_TYPE1")
      @js.native
      def HDR_TYPE1: NullStartofheading = js.native
      inline def HDR_TYPE1_=(x: NullStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HDR_TYPE1")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Midi.MetaEvent")
    @js.native
    open class MetaEvent ()
      extends typings.jsmidgen.mod.MetaEvent {
      def this(params: Data) = this()
    }
    object MetaEvent {
      
      @JSGlobal("Midi.MetaEvent.CHANNEL_PREFIX")
      @js.native
      val CHANNEL_PREFIX: `0x20` = js.native
      
      @JSGlobal("Midi.MetaEvent.COPYRIGHT")
      @js.native
      val COPYRIGHT: `0x02` = js.native
      
      @JSGlobal("Midi.MetaEvent.CUE_POINT")
      @js.native
      val CUE_POINT: `0x07` = js.native
      
      @JSGlobal("Midi.MetaEvent.END_OF_TRACK")
      @js.native
      val END_OF_TRACK: `0x2f` = js.native
      
      @JSGlobal("Midi.MetaEvent.INSTRUMENT")
      @js.native
      val INSTRUMENT: `0x04` = js.native
      
      @JSGlobal("Midi.MetaEvent.KEY_SIG")
      @js.native
      val KEY_SIG: `0x59` = js.native
      
      @JSGlobal("Midi.MetaEvent.LYRIC")
      @js.native
      val LYRIC: `0x05` = js.native
      
      @JSGlobal("Midi.MetaEvent.MARKER")
      @js.native
      val MARKER: `0x06` = js.native
      
      @JSGlobal("Midi.MetaEvent.SEQUENCE")
      @js.native
      val SEQUENCE: `0x00` = js.native
      
      @JSGlobal("Midi.MetaEvent.SEQ_EVENT")
      @js.native
      val SEQ_EVENT: `0x7f` = js.native
      
      @JSGlobal("Midi.MetaEvent.SMPTE")
      @js.native
      val SMPTE: `0x54` = js.native
      
      @JSGlobal("Midi.MetaEvent.TEMPO")
      @js.native
      val TEMPO: `0x51` = js.native
      
      @JSGlobal("Midi.MetaEvent.TEXT")
      @js.native
      val TEXT: `0x01` = js.native
      
      @JSGlobal("Midi.MetaEvent.TIME_SIG")
      @js.native
      val TIME_SIG: `0x58` = js.native
      
      @JSGlobal("Midi.MetaEvent.TRACK_NAME")
      @js.native
      val TRACK_NAME: `0x03` = js.native
    }
    
    @JSGlobal("Midi.Track")
    @js.native
    open class Track ()
      extends typings.jsmidgen.mod.Track {
      def this(config: Events) = this()
    }
    /* static members */
    object Track {
      
      @JSGlobal("Midi.Track")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Midi.Track.END_BYTES")
      @js.native
      def END_BYTES: js.Tuple4[`0x00`, `0xff`, `0x2f`, `0x00`] = js.native
      inline def END_BYTES_=(x: js.Tuple4[`0x00`, `0xff`, `0x2f`, `0x00`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END_BYTES")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Midi.Track.START_BYTES")
      @js.native
      def START_BYTES: js.Tuple4[`0x4d`, `0x54`, `0x72`, `0x6b`] = js.native
      inline def START_BYTES_=(x: js.Tuple4[`0x4d`, `0x54`, `0x72`, `0x6b`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("START_BYTES")(x.asInstanceOf[js.Any])
    }
    
    object Util {
      
      @JSGlobal("Midi.Util")
      @js.native
      val ^ : js.Any = js.native
      
      inline def bpmFromMpqn(mpqn: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bpmFromMpqn")(mpqn.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      inline def codes2Str(byteArray: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("codes2Str")(byteArray.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def ensureMidiPitch(p: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureMidiPitch")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
      inline def ensureMidiPitch(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureMidiPitch")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      object midiFlattenedNotes {
        
        @JSGlobal("Midi.Util.midi_flattened_notes")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("Midi.Util.midi_flattened_notes.a#")
        @js.native
        def a: bb = js.native
        
        inline def a_=(x: bb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a#")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Midi.Util.midi_flattened_notes.c#")
        @js.native
        def c: db = js.native
        
        inline def c_=(x: db): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("c#")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Midi.Util.midi_flattened_notes.d#")
        @js.native
        def d: eb = js.native
        
        inline def d_=(x: eb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("d#")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Midi.Util.midi_flattened_notes.f#")
        @js.native
        def f: gb = js.native
        
        inline def f_=(x: gb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f#")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Midi.Util.midi_flattened_notes.g#")
        @js.native
        def g: ab = js.native
        
        inline def g_=(x: ab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("g#")(x.asInstanceOf[js.Any])
      }
      
      object midiLetterPitches {
        
        @JSGlobal("Midi.Util.midi_letter_pitches")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("Midi.Util.midi_letter_pitches.a")
        @js.native
        def a: `21` = js.native
        inline def a_=(x: `21`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("a")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Midi.Util.midi_letter_pitches.b")
        @js.native
        def b: `23` = js.native
        inline def b_=(x: `23`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Midi.Util.midi_letter_pitches.c")
        @js.native
        def c: `12` = js.native
        inline def c_=(x: `12`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("c")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Midi.Util.midi_letter_pitches.d")
        @js.native
        def d: `14` = js.native
        inline def d_=(x: `14`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("d")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Midi.Util.midi_letter_pitches.e")
        @js.native
        def e: `16` = js.native
        inline def e_=(x: `16`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Midi.Util.midi_letter_pitches.f")
        @js.native
        def f: `17` = js.native
        inline def f_=(x: `17`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("f")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Midi.Util.midi_letter_pitches.g")
        @js.native
        def g: `19` = js.native
        inline def g_=(x: `19`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("g")(x.asInstanceOf[js.Any])
      }
      
      inline def midiPitchFromNote(n: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("midiPitchFromNote")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      object midiPitchesLetter {
        
        @JSGlobal("Midi.Util.midi_pitches_letter.12")
        @js.native
        val `12`: c = js.native
        
        @JSGlobal("Midi.Util.midi_pitches_letter.13")
        @js.native
        val `13`: cNumbersign = js.native
        
        @JSGlobal("Midi.Util.midi_pitches_letter.14")
        @js.native
        val `14`: d = js.native
        
        @JSGlobal("Midi.Util.midi_pitches_letter.15")
        @js.native
        val `15`: dNumbersign = js.native
        
        @JSGlobal("Midi.Util.midi_pitches_letter.16")
        @js.native
        val `16`: e = js.native
        
        @JSGlobal("Midi.Util.midi_pitches_letter.17")
        @js.native
        val `17`: f = js.native
        
        @JSGlobal("Midi.Util.midi_pitches_letter.18")
        @js.native
        val `18`: fNumbersign = js.native
        
        @JSGlobal("Midi.Util.midi_pitches_letter.19")
        @js.native
        val `19`: g = js.native
        
        @JSGlobal("Midi.Util.midi_pitches_letter.20")
        @js.native
        val `20`: gNumbersign = js.native
        
        @JSGlobal("Midi.Util.midi_pitches_letter.21")
        @js.native
        val `21`: a = js.native
        
        @JSGlobal("Midi.Util.midi_pitches_letter.22")
        @js.native
        val `22`: aNumbersign = js.native
        
        @JSGlobal("Midi.Util.midi_pitches_letter.23")
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
  }
}
