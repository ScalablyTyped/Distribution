organization := "org.scalablytyped"
name := "inert"
version := "5.1-dt-20201002Z-63524f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20200923Z-843cda",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20200515Z-599c0f",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20201028Z-e85ac7",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20200515Z-93859f",
  "org.scalablytyped" %%% "joi" % "17.3.0-423d65",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-a9d12a",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20201002Z-4fd9c5",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20201002Z-996143",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20200515Z-a3ee6d",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
