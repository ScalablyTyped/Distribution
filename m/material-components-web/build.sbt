organization := "org.scalablytyped"
name := "material-components-web"
version := "14.0.0-37a03b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__auto-init" % "14.0.0-cc5cf8",
  "org.scalablytyped" %%% "material__banner" % "14.0.0-0cce4e",
  "org.scalablytyped" %%% "material__base" % "14.0.0-3fe4c6",
  "org.scalablytyped" %%% "material__checkbox" % "14.0.0-babf21",
  "org.scalablytyped" %%% "material__chips" % "14.0.0-253f0d",
  "org.scalablytyped" %%% "material__circular-progress" % "14.0.0-9ea692",
  "org.scalablytyped" %%% "material__data-table" % "14.0.0-a83794",
  "org.scalablytyped" %%% "material__dialog" % "14.0.0-61f0e9",
  "org.scalablytyped" %%% "material__dom" % "14.0.0-9818b5",
  "org.scalablytyped" %%% "material__drawer" % "14.0.0-cbb012",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-992249",
  "org.scalablytyped" %%% "material__form-field" % "14.0.0-3d3a90",
  "org.scalablytyped" %%% "material__icon-button" % "14.0.0-a497e3",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-8ce602",
  "org.scalablytyped" %%% "material__linear-progress" % "14.0.0-6706c4",
  "org.scalablytyped" %%% "material__list" % "14.0.0-228f83",
  "org.scalablytyped" %%% "material__menu" % "14.0.0-c11132",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-6145dc",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-e92e5e",
  "org.scalablytyped" %%% "material__progress-indicator" % "14.0.0-2e24fe",
  "org.scalablytyped" %%% "material__radio" % "14.0.0-93aa77",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-eac5db",
  "org.scalablytyped" %%% "material__segmented-button" % "14.0.0-c39155",
  "org.scalablytyped" %%% "material__select" % "14.0.0-0b26cf",
  "org.scalablytyped" %%% "material__slider" % "14.0.0-b37749",
  "org.scalablytyped" %%% "material__snackbar" % "14.0.0-29ae4e",
  "org.scalablytyped" %%% "material__switch" % "14.0.0-bafd24",
  "org.scalablytyped" %%% "material__tab" % "14.0.0-5780f5",
  "org.scalablytyped" %%% "material__tab-bar" % "14.0.0-afbbb3",
  "org.scalablytyped" %%% "material__tab-indicator" % "14.0.0-db0b3a",
  "org.scalablytyped" %%% "material__tab-scroller" % "14.0.0-9ffb6f",
  "org.scalablytyped" %%% "material__textfield" % "14.0.0-49dab3",
  "org.scalablytyped" %%% "material__tooltip" % "14.0.0-faa637",
  "org.scalablytyped" %%% "material__top-app-bar" % "14.0.0-9b68c9",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
