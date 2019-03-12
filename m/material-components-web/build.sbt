organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190212Z-82e8f5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20190213Z-447879",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190213Z-984480",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20190213Z-7606c2",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20190213Z-95a4f0",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20190213Z-4a1d8c",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190213Z-9cced9",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190213Z-433bd5",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-be6294",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20190213Z-c0f141",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20190213Z-d982ee",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20190213Z-eac501",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-cafe75",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20190213Z-36d5b9",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190213Z-57c70b",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20190213Z-a9cfe2",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-269896",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20190213Z-87526c",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190213Z-9aeff6",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20190213Z-6d0e76",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-297546",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20190213Z-22dfa3",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20190213Z-8bec7f",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20190213Z-f689b0",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20190213Z-1bc2e9",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20190213Z-370e15",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20190213Z-c4b852",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        