organization := "org.scalablytyped"
name := "material-components-web"
version := "14.0.0-b4ce7b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__auto-init" % "14.0.0-b5656d",
  "org.scalablytyped" %%% "material__banner" % "14.0.0-21ef8d",
  "org.scalablytyped" %%% "material__base" % "14.0.0-d6291d",
  "org.scalablytyped" %%% "material__checkbox" % "14.0.0-0dd84e",
  "org.scalablytyped" %%% "material__chips" % "14.0.0-7552f3",
  "org.scalablytyped" %%% "material__circular-progress" % "14.0.0-5501b2",
  "org.scalablytyped" %%% "material__data-table" % "14.0.0-ab27ca",
  "org.scalablytyped" %%% "material__dialog" % "14.0.0-6bbb81",
  "org.scalablytyped" %%% "material__dom" % "14.0.0-438a74",
  "org.scalablytyped" %%% "material__drawer" % "14.0.0-e6d663",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-8c0d1b",
  "org.scalablytyped" %%% "material__form-field" % "14.0.0-2615d9",
  "org.scalablytyped" %%% "material__icon-button" % "14.0.0-5c0729",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-485933",
  "org.scalablytyped" %%% "material__linear-progress" % "14.0.0-69955e",
  "org.scalablytyped" %%% "material__list" % "14.0.0-7fe922",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-ca20fd",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-7f7844",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-f7cd92",
  "org.scalablytyped" %%% "material__progress-indicator" % "14.0.0-3832c4",
  "org.scalablytyped" %%% "material__radio" % "14.0.0-6a57cf",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-e865af",
  "org.scalablytyped" %%% "material__segmented-button" % "14.0.0-a540df",
  "org.scalablytyped" %%% "material__select" % "14.0.0-794624",
  "org.scalablytyped" %%% "material__slider" % "14.0.0-5587f1",
  "org.scalablytyped" %%% "material__snackbar" % "14.0.0-920244",
  "org.scalablytyped" %%% "material__switch" % "14.0.0-133f33",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-fab361",
  "org.scalablytyped" %%% "material__tab-bar" % "14.0.0-d25f34",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-f20179",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-fd8716",
  "org.scalablytyped" %%% "material__textfield" % "14.0.0-02d464",
  "org.scalablytyped" %%% "material__tooltip" % "14.0.0-e9b13b",
  "org.scalablytyped" %%% "material__top-app-bar" % "14.0.0-7c92ee",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
