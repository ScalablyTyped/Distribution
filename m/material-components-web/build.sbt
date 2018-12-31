organization := "org.scalablytyped"
name := "material-components-web"
version := "0.35-dt-20180511Z-0ed374"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180511Z-9270d4",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-a75cf1",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180511Z-059ace",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20180511Z-b15e63",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20180511Z-9b1d1a",
  "org.scalablytyped" %%% "material__drawer" % "0.35-dt-20180511Z-129b8a",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180511Z-2fe6fb",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20180511Z-f2266d",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180511Z-1fa53c",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180511Z-f158d8",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180511Z-5d26ae",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180511Z-b9a977",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20180809Z-1453fa",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180511Z-de2d9d",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20180511Z-b3fc1f",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-357a8a",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20180511Z-009dfa",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180511Z-1b3dba",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20180511Z-2b34be",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180511Z-b8ef24",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20180511Z-8dc08b",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20180511Z-043872",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180511Z-9597d3",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180511Z-f4b850",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        